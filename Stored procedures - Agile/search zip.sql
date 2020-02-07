CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_zip`(userSearch VARCHAR(30))
BEGIN
SELECT DISTINCT * 
FROM provider 
WHERE providerZipCode like concat('%' , userSearch , '%');
END