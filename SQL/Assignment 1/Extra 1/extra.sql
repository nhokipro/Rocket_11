DROP DATABASE IF EXISTS manager;
CREATE DATABASE manager;
USE manager;
CREATE TABLE trainee(
	traineeID		TINYINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    full_name		VARCHAR(50) NOT NULL,
    birth_day		DATETIME NOT NULL,
    gender			ENUM('male', 'female', 'unknown'),
    ET_IQ			TINYINT UNSIGNED CHECK (ET_IQ<=20) NOT NULL,
    ET_Gmath		TINYINT UNSIGNED CHECK (ET_Gmath<=20) NOT NULL,
    ET_English		TINYINT UNSIGNED CHECK (ET_English<=50) NOT NULL,
    training_class	VARCHAR(20) NOT NULL,
    evalution_note	VARCHAR(100) NOT NULL
);

-- them truong`
ALTER TABLE trainee ADD COLUMN VTI_account VARCHAR(50) NOT NULL UNIQUE;

-- cau 2
CREATE TABLE exercise_2(
	ID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `name`			VARCHAR(50) NOT NULL,
    `code`			CHAR(5) NOT NULL,
    modified_date	DATETIME DEFAULT NOW()
    );
    
    -- cau 3
CREATE TABLE exercise_3(
	ID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `name`			VARCHAR(50) NOT NULL,
    bithday			DATE,
    gender			ENUM('male', 'female', 'unknown'),
    isDetectedFlag	ENUM('0', '1') -- 0: dang hoat dong -- 1: da xoa
    );