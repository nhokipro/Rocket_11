DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE ThucTap;
USE ThucTap;

/* ---------------------tạo bảng--------------------------------*/
DROP TABLE IF EXISTS country;
CREATE TABLE country(
	country_id			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    country_name		VARCHAR(50) NOT NULL UNIQUE
);

DROP TABLE IF EXISTS location;
CREATE TABLE location(
	location_id			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    street_address		VARCHAR(50) NOT NULL,
    postal_code			VARCHAR(50)	UNIQUE NOT NULL,
    country_id			TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY (country_id) REFERENCES country(country_id)
);

DROP TABLE IF EXISTS employee;
CREATE TABLE employee(
	employee_id			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    full_name			VARCHAR(50) NOT NULL,
    email				VARCHAR(50) NOT NULL,
    location_id			TINYINT UNSIGNED NOT NULL,
    CONSTRAINT s FOREIGN KEY (location_id) REFERENCES location (location_id)
);

/* ---------------- INSERT data ---------------------- */

INSERT INTO country (country_name) 
VALUES 				('China'),
					('Finland'),
					('Viet Nam'),
					('America'),
					('Sweden');

insert into location 	(street_address, 				postal_code, 			country_id) 
values 					('9 Lakewood Gardens Alley', 	'7007', 				3),
						('83715 Straubel Alley', 		'8008', 				1),
						('6 Iowa Terrace', 				'9009', 				4),
						('8 Montana Circle', 			'a1054', 				5),
						('3 Eagle Crest Court', 		'4690-667', 			1);

insert into employee 		(full_name, 			email, 						location_id) 
values 						('Araldo Godsal', 		'nn03@gmail.com', 		2),
							('Ysabel Heindrick', 	'yheindrick1@joomla.org', 	1),
							('Cortie Lammiman', 	'clammiman2@nytimes.com', 	2),
							('Bear Renon', 			'brenon3@ed.gov', 			1),
							('Myrlene Yurlov', 		'myurlov4@ebay.com', 		5);

-- ques 2
-- a 
SELECT e.full_name, e.email 
FROM location l
JOIN employee e ON l.location_id = e.location_id
JOIN country c ON l.country_id = c.country_id
WHERE c.country_name = 'viet nam';
-- b 
SELECT c.country_name
FROM location l
JOIN employee e ON l.location_id = e.location_id
JOIN country c ON l.country_id = c.country_id
WHERE e.email = 'nn03@gmail.com';
-- c
SELECT c.country_id,l.location_id, count(employee_id)
FROM location l
LEFT JOIN employee e ON l.location_id = e.location_id 
RIGHT JOIN country c ON l.country_id = c.country_id
GROUP BY c.country_id;

-- ques 3
DROP TRIGGER IF EXISTS trigger_employee;
DELIMITER $$
CREATE TRIGGER trigger_employee
BEFORE INSERT ON employee
FOR EACH ROW
BEGIN

	DECLARE soluongEmployee TINYINT;
	SELECT count(e.employee_id) INTO soluongEmployee
	FROM employee e
	JOIN location l ON e.location_id = l.location_id 
	RIGHT JOIN country c ON c.country_id = l.country_id
	WHERE employee_id = NEW.employee_id
	GROUP BY c.country_id;

    
    IF soluongEmployee > 10 
		THEN SIGNAL SQLSTATE '12345'
    SET MESSAGE_TEXT = 'loi';
    END IF;

END $$

DELIMITER ;
insert into employee 		(full_name, 			email, 						location_id) 
values 						('Araldo Gods2al', 		'nnsss22n03@gmail.com', 		2);
-- ques 4 
ALTER TABLE employee
MODIFY COLUMN location_id TINYINT UNSIGNED;
ALTER TABLE employee
DROP FOREIGN KEY s;
ALTER TABLE employee
ADD FOREIGN KEY (location_id) REFERENCES location (location_id) ON DELETE SET NULL;
DELETE 
FROM location
WHERE location_id =2;

