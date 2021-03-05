insert into trainee 	(full_name, birth_day, gender, ET_IQ, ET_Gmath, ET_english, training_class, evalution_note) 
values 					('Westleigh Jestico', '1998-03-22', 'male', 20, 2, 26, 'GEL', 'Proin leo odonsequat ut, nulla.'),
						('Evelina Muddimer', '2001-12-22', 'unknown', 9, 20, 4, 'IDR', 'Nam ultricenulla e sit amet nunc viverra dapibus.'),
						('Auguste Scotchbrook', '2000-02-05', 'unknown', 14, 4, 29, 'EUR', 'Fusce consequat.'),
						('Rodie Marzelo', '1998-09-25', 'female', 16, 10, 49, 'KZT', 'Nulla ut erat id llam varius.'),
						('Fields Pfaffel', '1999-10-28', 'female', 17, 3, 44, 'PHP', 'Nulla nisl. Nnim blandit mi, in porttitor pede justo eu massa.'),
						('Derek Bearblock', '1999-04-08', 'male', 13, 2, 37, 'IDR', 'Duis atis,to eu massa. Donec dapibus. Duis at velit eu est congue elementum.'),
						('Roland Beavis', '1998-06-13', 'unknown', 16, 3, 13, 'RUB', 'Suspendisse pos vitae ipsum.'),
						('Korry Skully', '2001-03-19', 'male', 3, 5, 14, 'CNY', 'Phasellus sit amet erat. Nulla tempus.'),
						('Corabelle Ledster', '1998-06-27', 'unknown', 20, 13, 10, 'HRK', 'Donec vitae nisi. Nam ulel enim sit amet nunc viverra dapibus.'),
						('Danell Di Maggio', '2001-05-09', 'female', 5, 1, 21, 'USD', 'Praesent blandit.');

-- ques 2
-- ques 3
SELECT *, char_length(full_name)
FROM trainee
WHERE char_length(full_name) = (SELECT max(char_length(full_name))
								FROM trainee);
-- ques 4
SELECT *
FROM trainee
WHERE ET_IQ + ET_Gmath >= 20 AND ET_IQ >= 8 AND ET_Gmath >=8 AND ET_English >=18;
-- ques 5
DELETE FROM trainee WHERE traineeID = 3;
-- ques 6
UPDATE trainee 
SET trainning_class = 'IDR'
WHERE trainningID = 5;
-- excersise 2
DROP TABLE IF EXISTS department;
CREATE TABLE department(
	department_number			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    department_name				VARCHAR(50) NOT NULL
);
DROP TABLE IF EXISTS employee_table;
CREATE TABLE employee_table(
	employee_number				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    employee_name 				VARCHAR(50) NOT NULL,
    department_number			TINYINT UNSIGNED,
    FOREIGN KEY (department_number) REFERENCES department(department_number)
);
DROP TABLE IF EXISTS employee_skill_table;
CREATE TABLE employee_skill_table(
	employee_number 			TINYINT UNSIGNED,
    skill_code					VARCHAR(50),
    date_registered				DATETIME DEFAULT NOW(),
    FOREIGN KEY (employee_number) REFERENCES employee_table (employee_number)
);
INSERT INTO department (department_name)
VALUES					('manager'),
						('accounting'),
                        ('director'),
                        ('sale'),
                        ('tele sale'),
                        ('development'),
                        ('test'),
                        ('security'),
                        ('human resouces'),
                        ('tolet');
insert into employee_table 	(employee_name, department_number)
 values 					('Trista Leney', 3),
							('Barrie Tolchard', 8),
							('Leif Noades', 6),
							('Lacee MacIllrick', 4),
							('Magdalena Disney', 2),
							('Debee Ducker', 7),
							('Debora Rishworth', 3),
							('Diena Thick', 3),
							('Buiron Marrett', 5),
							('Harmon Vials', 7);
insert into employee_skill_table 	(employee_number, skill_code, date_registered) 
values 								(6, 'c++', '2021-02-21'),
									(8, 'java', '2020-09-17'),
									(7, 'pascal', '2021-01-02'),
									(6, '.NET', '2020-10-15'),
									(9, 'C', '2020-03-26'),
									(4, 'javascript', '2020-09-30'),
									(8, 'javascript', '2020-05-20'),
									(8, 'SQL', '2020-07-24'),
									(1, 'C', '2020-10-14'),
									(4, 'PHP', '2020-11-04');
SELECT  *
FROM	employee_table et
JOIN 	employee_skill_table est ON et.employee_number = est.employee_number
WHERE	est.skill_code = 'java';
-- ques 4
SELECT department_name, count(et.department_number)
FROM	department d
JOIN	employee_table et ON d.department_number=et.department_number
GROUP BY et.department_number
HAVING count(et.department_number) >=3
-- ques 5


