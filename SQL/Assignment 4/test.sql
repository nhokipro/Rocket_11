DROP FUNCTION IF EXISTS get_department_id;
DELIMITER $$
CREATE FUNCTION get_department_id (id INTEGER)  RETURNS VARCHAR(100)
BEGIN 
	DECLARE `name` varchar(100);
	SET `name` ='';
	SELECT DepartmentName INTO `name`
	FROM department
	WHERE DepartmentID = id;
	RETURN `name`;
END $$
DELIMITER ;
-- ---------------------
DROP PROCEDURE IF EXISTS get_account;
DELIMITER $$
CREATE PROCEDURE get_account ( in_department_name VARCHAR(50))
	BEGIN
		SELECT *
        FROM `account` a
        JOIN department d ON a.DepartmentID = d.DepartmentID
        WHERE d.DepartmentName LIKE concat('%' ,in_department_name, '%');
	END $$
DELIMITER ;
-- -----------------
-- cau2
DROP PROCEDURE IF EXISTS get_amount_account;
DELIMITER $$
CREATE PROCEDURE get_amount_account ( in_group_name VARCHAR(50))
	BEGIN
		SELECT count(ga.AccountID)
        FROM `group` g
        JOIN groupaccount ga ON g.GroupID = ga.GroupID
        WHERE g.GroupName LIKE concat('%' ,in_group_name, '%');
	END $$
DELIMITER ;
-- --------------------------
-- cau3
DROP PROCEDURE IF EXISTS get_question;
DELIMITER $$
CREATE PROCEDURE get_question (in_type_question ENUM('essay', 'Multiple-Choice'))
	BEGIN
		SELECT count(q.questionID)
        FROM typequestion tp
        JOIN question q ON tp.TypeID = q.TypeID
        WHERE tp.TypeName LIKE concat('%' , in_type_question, '%') AND month(q.CreateDate)=month(now()) AND year(q.CreateDate)=year(now());
	END $$
DELIMITER ; 
-- cau 4
typequestionDROP PROCEDURE IF EXISTS get_max_question
DELIMITER $$
CREATE PROCEDURE get_max_question (OUT out_questionID TINYINT)
	BEGIN
		SELECT   q.TypeID INTO out_questionID
        FROM question q
        JOIN typequestion tq ON q.TypeID=tq.TypeID
        GROUP BY q.TypeID
        HAVING count(q.TypeID)=(SELECT max(a)
								FROM (SELECT count(TypeID) AS a
										FROM question
                                        GROUP BY TypeID
										) AS b
									);
	END $$
DELIMITER ;

SET @id = -1;
CALL get_max_question (@id);
SELECT @id;
-- cau 5
DROP PROCEDURE IF EXISTS get_type_name
DELIMITER $$
CREATE PROCEDURE get_type_name (OUT out_type_name VARCHAR(50))
	BEGIN
		SELECT   tq.TypeName INTO out_type_name
        FROM question q
        JOIN typequestion tq ON q.TypeID=tq.TypeID
        GROUP BY q.TypeID
        HAVING count(q.TypeID)=(SELECT max(a)
								FROM (SELECT count(TypeID) AS a
										FROM question
                                        GROUP BY TypeID
										) AS b
									);
	END $$
DELIMITER ;

SET @v_type_name = '';
CALL get_type_name (@v_type_name);
SELECT @v_type_name;
-- cau 6groupaccount
-- cau 6
DROP PROCEDURE IF EXISTS `get`;
DELIMITER $$
CREATE PROCEDURE `get` (IN `string` VARCHAR(100))
	BEGIN
		SELECT g.GroupName , a.UserName
        FROM groupaccount ga
        JOIN `account` a ON ga.AccountID = a.AccountID
        JOIN `group` g ON ga.GroupID = g.GroupID
        WHERE g.GroupName LIKE concat('%', `string`, '%')
        OR a.UserName LIKE concat('%', `string`, '%');
	END $$
DELIMITER ;

-- chua cau 6

 
-- cau 8
DROP PROCEDURE IF EXISTS `get8`;
DELIMITER $$
CREATE PROCEDURE `get1` (IN `string` ENUM('Essay', 'Multiple-choice'))
	BEGIN
		
		SELECT char_length(q.Content), tq.TypeName
        FROM typequestion tq
        JOIN question q ON tq.TypeID = q.TypeID
        WHERE tq.TypeName = `string`
        AND char_length(q.Content) = ( SELECT max(a)
										FROM( SELECT char_length(Content) AS a, tq.TypeName
												FROM question q
                                                JOIN typequestion tq ON q.TypeID = tq.TypeID
                                                WHERE TypeName=`string`
												) AS b
										);
	END $$
DELIMITER ; 
-- cau 9
DROP PROCEDURE IF EXISTS `get9`;
DELIMITER $$
CREATE PROCEDURE `get9` (IN `id` TINYINT)
	BEGIN
		DELETE  FROM exam
        WHERE ExamID = id;
	END $$
DELIMITER ; 