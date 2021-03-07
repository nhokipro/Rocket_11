SELECT * 
FROM department 
WHERE department_name = 'Sale';

SELECT full_name, char_length(full_name)
FROM `account`
WHERE char_length(full_name)= (SELECT MAX(char_length(full_name))
								FROM `account`);



SELECT *
FROM `group`
WHERE create_date < '2019/12/20';

-- cau 5
SELECT *, count(questionID)
FROM answer
GROUP BY questionID
HAVING count(questionID)>=2;

-- cau 6
 SELECT *
 FROM `group`
 ORDER BY create_date asc;
 
 -- cau 10
SELECT 		*
FROM 		account a
JOIN 		department d ON a.departmentID = d.departmentID;
-- cau 11
SELECT full_name
FROM position p
JOIN `account` a ON p.positionID=a.positionID
WHERE position_name='dev';
-- cau 19
SELECT type_name, COUNT(q.questionID)
FROM question q
JOIN type_question tq ON q.typeID=tq.typeID
GROUP BY tq.type_name;
-- cau 15
SELECT*, count(a.questionID)
FROM question q
JOIN answer a on q.questionID = a.questionID
GROUP BY a.questionID
HAVING count(a.questionID) = (SELECT max(count(a.questionID) 
							( SELECT count(a.questionID)
								FROM answer
                                GROUP BY questionID
                            )
							from answer);
-- cau 14
SELECT *, count(q.categoryID)
FROM category_question cq
JOIN question q ON cq.categoryID = q.categoryID
GROUP BY q.categoryID;
-- cau 9 
UPDATE `account`
SET account_name = 'nguyen ba loc'
WHERE accountID=5;
-- cau 17
SELECT d.department_name,p.position_name , count(p.position_name)
FROM `account` a
JOIN department d ON a.departmentID=d.departmentID
JOIN position p ON a.positionID=p.positionID
GROUP BY position_name