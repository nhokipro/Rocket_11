SELECT Name
FROM product
WHERE ProductSubcategoryID = (SELECT ProductSubcategoryID
								FROM productsubcategory
                                WHERE `Name` = 'Saddles'
								);
-- cau2
SELECT `Name`
FROM product
WHERE ProductSubcategoryID IN (SELECT ProductSubcategoryID AS a
								FROM productsubcategory
                                WHERE `Name` LIKE 'Bo%'
								);
-- cau 3
SELECT `Name`
FROM product
WHERE ListPrice IN (SELECT min(ListPrice)
								FROM product
								WHERE ProductSubcategoryID = '3'
								);
-- exercise 2
-- ques 1
SELECT cr.`Name`, sp.`Name`
FROM countryregion cr 
JOIN stateprovince sp ON cr.CountryRegionCode= sp.CountryRegionCode;
-- ques 2
SELECT cr.`Name` AS 'Country', sp.`Name` AS 'Provine'
FROM countryregion cr 
JOIN stateprovince sp ON cr.CountryRegionCode= sp.CountryRegionCode
WHERE cr.`Name` IN('Germany', 'Canada')
ORDER BY Country;
-- ques 3
SELECT soh.SalesOrderID, soh.OrderDate, soh.SalesPersonID, sp.Bonus, sp.SalesYTD
FROM salesperson sp
JOIN salesorderheader soh ON sp.SalesPersonID=soh.SalesPersonID;
-- ques 4
SELECT 	soh.SalesOrderID, soh.OrderDate, e.Title, sp.Bonus, sp.SalesYTD
FROM	salesperson sp 
JOIN salesorderheader soh ON SP.SalesPersonID = soh.SalesPersonID
JOIN employee e ON sp.SalesPersonID = e.EmployeeID;
