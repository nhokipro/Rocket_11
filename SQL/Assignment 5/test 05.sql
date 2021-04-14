INSERT INTO `Group`	(  GroupName			, CreatorID		, CreateDate)
VALUE 				('abc'		,   11			,'2005-09-05');
DROP TRIGGER IF EXISTS trigger_insert_group;
DELIMITER $$

CREATE TRIGGER trigger_insert_group
BEFORE INSERT ON `group`
FOR EACH ROW
BEGIN

	IF	year(now()) -1 > year(NEW.CreateDate)
    THEN 
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = 'loi';	
    END IF;
    
END $$

DELIMITER ;

-- ques 2
INSERT INTO Department	(DepartmentName) VALUE 
						(N'Sale'	);
DROP TRIGGER IF EXISTS trigger_user_name;
DELIMITER $$

CREATE TRIGGER trigger_user_name
BEFORE INSERT ON `department`
FOR EACH ROW
BEGIN
    IF
		NEW.DepartmentName = 'Sale' THEN 
        SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'loi';
    END IF;
    
END $$
DELIMITER ;
-- ques 3
INSERT INTO `groupaccount`	(  GroupID	, AccountID	, JoinDate	 )
VALUE 						(	2		,   8		,'2019-05-05');

DROP TRIGGER IF EXISTS trigger_group;
DELIMITER $$

CREATE TRIGGER trigger_group
BEFORE INSERT ON `groupaccount`
FOR EACH ROW
BEGIN
	DECLARE soluongAccount TINYINT;
    SELECT count(AccountID) INTO soluongAccount
    FROM groupaccount
    WHERE GroupID = NEW.GroupID;
    IF soluongAccount > 5 THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT ='loi';
    END IF;
END $$
DELIMITER ;
-- ques 4
DROP TRIGGER IF EXISTS trigger_examquestion;
DELIMITER $$

CREATE TRIGGER trigger_examquestion
BEFORE INSERT ON examquestion
FOR EACH ROW
BEGIN
	DECLARE soluongQuestion TINYINT;
    SELECT count(AccountID) INTO soluongQuestion
    FROM examquestion
    WHERE QuestionID = NEW.QuestionID;
    IF soluongQuestion > 5 THEN
    SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT ='loi';
    END IF;
END $$
DELIMITER ;
-- ques 5
DELETE  FROM `account`
WHERE email = 'admin@gmail.com';
DROP TRIGGER IF EXISTS trigger_delete_account;
DELIMITER $$
CREATE TRIGGER trigger_delete_account
BEFORE DELETE ON `Account`
FOR EACH ROW
BEGIN
	IF OLD.Email = 'admin@gmail.com' 
    THEN 
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = 'loi';
	END IF;
    
END $$
DELIMITER ; 
-- ques 6
DROP TRIGGER IF EXISTS trigger_create_account;
DELIMITER $$
	CREATE TRIGGER trigger_create_account
    BEFORE INSERT ON `Account`
    FOR EACH ROW
    BEGIN
		DECLARE WaitingDepartment_ID TINYINT UNSIGNED;
			SELECT DepartmentID INTO WaitingDepartment_ID
            FROM Department
            WHERE DepartmentName = 'Phòng chờ';
		IF NEW.DepartmentID IS NULL
        THEN SET NEW.DepartmentID = WaitingDepartment_ID;
		END IF;
	END $$
    DELIMITER ;
INSERT INTO Department	(DepartmentID, DepartmentName) VALUE 
						(NULL, 'abc'	);
-- ques 7
DROP TRIGGER IF EXISTS trigger_answer;
DELIMITER $$

CREATE TRIGGER trigger_answer
BEFORE INSERT ON answer
FOR EACH ROW
BEGIN
	DECLARE soluongAnswer TINYINT;
    DECLARE soluongAnswerCorrect TINYINT;
    SELECT count(AnswerID) INTO soluongAnswer
    FROM answer
    WHERE questionID = NEW.questionID;
    SELECT count(AnswerID) INTO soluongAnswerCorrect
    FROM answer
    WHERE questionID = NEW.questionID AND isCorrect = 1;
    IF soluongAnswer >=4 OR soluongAnswerCorrect>=2 THEN 
        SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Cannot insert data';
		END IF;
END $$
DELIMITER ;
INSERT INTO Answer	(  Content		, QuestionID	, isCorrect	)
VALUE 				(N'Trả lời 33'	,   1			,	1		);
-- ques 9
DROP TRIGGER IF EXISTS trigger_exam;
DELIMITER $$

CREATE TRIGGER trigger_exam
BEFORE DELETE ON exam
FOR EACH ROW
BEGIN
	IF date_sub(now(), interval 2 DAY) 
    THEN SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = 'loi';
    END IF;
END $$
DELIMITER ;
DELETE FROM Exam
WHERE `Code` = 'VTIQ301';
-- ques 10
DROP TRIGGER IF EXISTS trigger_question;
DELIMITER $$

CREATE TRIGGER trigger_question
BEFORE UPDATE ON question
FOR EACH ROW
BEGIN
	DECLARE question_is_not_in_exam TINYINT;
    SELECT q.questionID INTO question_is_not_in_exam
    FROM question q
    LEFT JOIN examquestion eq ON q.questionID = eq.questionID
    WHERE eq.ExamID IS NULL;
    IF NEW.questionID != question_is_not_in_exam
    THEN SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = 'loi';
    END IF;
END $$
DELIMITER ;

