DROP DATABASE IF EXISTS testing_system_assignment_1;
CREATE DATABASE testing_system_assignment_1;
USE testing_system_assignment_1;

-- bang1
CREATE TABLE department(
	departmentID		TINYINT AUTO_INCREMENT PRIMARY KEY,
    department_name		VARCHAR(50) NOT NULL UNIQUE KEY
);
-- add data
INSERT INTO department ( department_name)
VALUES					('marketing'),
						('security'),
						('manager'),
                        ('director'),
                        ('employee');


-- bang2                        
CREATE TABLE position (
	positionID			TINYINT AUTO_INCREMENT PRIMARY KEY,
	position_name		ENUM('Dev', 'Test', 'Scrum Master', 'PM') NOT NULL
);

INSERT INTO position (position_name)
VALUES				('Dev'),
					('Test'),
                    ('Scrum Master'),
                    ('Dev'),
                    ('PM');


-- bang 3
CREATE TABLE `account` (
	accountID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    email				VARCHAR(100) NOT NULL UNIQUE KEY,
    user_name			VARCHAR(50) NOT NULL UNIQUE KEY,
    full_name			VARCHAR(50) NOT NULL,
    departmentID		TINYINT NOT NULL,
    positionID			TINYINT NOT NULL,
    create_date			DATETIME DEFAULT NOW(),
    FOREIGN KEY (departmentID) REFERENCES department (departmentID),
    FOREIGN KEY (positionID) REFERENCES `position` (positionID)
);

INSERT INTO `account` (email, 						user_name, 	full_name, 				departmentID, 	positionID, 	create_date)
VALUES 					('caoson2kk39@gmail.com',	'chs',		'Cao Hung Son', 		1, 				1, 				'2020-11-30'),
						('htan@gmail.com',			'htan',		'Hoang Thi Anh Ngoc', 	2, 				2, 				'2020-10-17'),
						('ctq@gmail.com',			'ctq',		'Cao Trong Quy', 		3, 				3, 				'2020-11-23'),
						('ntmt@gmail.com',			'ntmt',		'Nguyen Thi Minh Thu', 	4, 				4, 				'2020-10-20'),
						('cvt@gmail.com',			'cvt',		'Cao Van Thuat', 		5, 				5, 				'2020-11-20');


-- bang 4
CREATE TABLE `group` (
	groupID				TINYINT  AUTO_INCREMENT PRIMARY KEY,
	group_name			VARCHAR(50) NOT NULL,
    creatorID			TINYINT NOT NULL,
    create_date			DATETIME DEFAULT NOW()
);

INSERT INTO `group` (group_name,		creatorID,		create_date)
VALUES				('cosy',			1,				'2020-1-1'),
					('chocopie',		2,				'2020-2-2'),
                    ('danisa',			3,				'2020-3-3'),
                    ('oreo',			4,				'2020-4-5'),
                    ('creamo',			5,				'2020-6-7');

-- bang 5
CREATE TABLE group_account (
	groupID				TINYINT NOT NULL,
    accountID			TINYINT NOT NULL,
    join_date			DATETIME DEFAULT NOW(),
    PRIMARY KEY(groupID, accountID)
);

INSERT INTO group_account 	(groupID,			accountID,		join_date)
VALUES						(1,					1,				'2020-10-10'),
							(2,					3,				'2020-11-01'),
                            (3,					3,				'2020-12-05'),
                            (4,					5,				'2020-05-10'),
                            (5,					1,				'2020-06-10');

-- bang 6
CREATE TABLE type_question (
	typeID			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    type_name		ENUM('Essay','Multiple-Choice')
);

INSERT INTO type_question 	( type_name)
VALUES						('Essay'),
							('Multiple-Choice'),
                            ('Multiple-Choice'),
                            ('Essay'),
                            ('Multiple-Choice');

-- bang 7
CREATE TABLE category_question (
	categoryID		TINYINT AUTO_INCREMENT PRIMARY KEY,
    category_name	VARCHAR(50) NOT NULL
);

INSERT INTO category_question 	(category_name)
VALUES							('java'),
								('.net'),
								('php'),
                                ('C++'),
                                ('javascrip');

-- bang 8
CREATE TABLE question (
	questionID		TINYINT AUTO_INCREMENT PRIMARY KEY,
    content			VARCHAR(100) NOT NULL,
    categoryID		TINYINT ,	
	typeID			TINYINT UNSIGNED NOT NULL,
    creatorID		TINYINT UNSIGNED,
    create_date		DATETIME DEFAULT NOW(),
    FOREIGN KEY (categoryID) REFERENCES category_question(categoryID),
    FOREIGN KEY (typeID) REFERENCES type_question(typeID),
    FOREIGN KEY (creatorID) REFERENCES `account`(accountID)
);
INSERT INTO question 	(content,					categoryID,		typeID,		creatorID,		create_date)
VALUES					('java la gi',				2,				1,			4,				'2020-05-28'),
						('.net de lam gi',			5,				2,			1,				'2020-03-22'),
                        ('c++ su dung phan mem gi',	4,				3,			2,				'2020-12-6'),
                        ('C la gi',					3,				4,			2,				'2020-02-05'),
                        ('php tac dung gi',			1,				5,			5,				'2020-10-30');

-- bang 9
CREATE TABLE answer (
	answerID		TINYINT AUTO_INCREMENT PRIMARY KEY,
    content			VARCHAR(100) NOT NULL,
    questionID		TINYINT NOT NULL ,
    isCorrect		ENUM('dung', 'sai'),
    FOREIGN KEY (questionID) REFERENCES question(questionID)
);

INSERT INTO answer 		(content,									questionID,		isCorrect)
VALUES					('java la ngon ngu lap trinh',				2,				'dung'),
						('.net de lap trinh',						5,				'sai'),
                        ('c++ su dung phan mem VSC',				4,				'sai'),
                        ('C la ngon ngu lap trinh',					3,				'dung'),
                        ('php de lap trinh web',					1,				'dung');

-- bang 10
CREATE TABLE exam (
	examID			TINYINT AUTO_INCREMENT PRIMARY KEY,
    `code`			VARCHAR(10) NOT NULL ,
    title			VARCHAR(100) NOT NULL,
    categoryID		TINYINT,
    duration		SMALLINT NOT NULL,
    creatorID		TINYINT UNSIGNED,
    create_date		DATETIME DEFAULT NOW(),
    FOREIGN KEY (categoryID) REFERENCES category_question (categoryID),
    FOREIGN KEY (creatorID) REFERENCES `account`(accountID)
);

INSERT INTO exam 		(`code`,		title,					categoryID,		duration,	creatorID,		create_date)
VALUES					('de 1',		'lap trinh java',		1,				120,		5,				'2020-06-29'),
						('de 2',		'lap trinh c++',		2,				60,			4,				'2020-03-23'),
                        ('de 3',		'lap trinh c',			3,				180,		2,				'2020-12-16'),
                        ('de 5',		'lap trinh c#',			4,				90,			1,				'2020-02-15'),
                        ('de 4',		'lap trinh php',		5,				300,		3,				'2020-10-03');

-- bang 11
CREATE TABLE examquestion (
	examID			TINYINT,
    questionID		TINYINT,
    PRIMARY KEY(examID, questionID),
    FOREIGN KEY (examID) REFERENCES exam(examID),
    FOREIGN KEY (questionID) REFERENCES answer(questionID)
);

INSERT INTO examquestion 	(examID,			questionID)
VALUES						(1,					1),
							(2,					3),
                            (3,					4),
                            (4,					5),
                            (5,					1);