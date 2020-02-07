CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_name`(userSearch VARCHAR(80))
BEGIN
SELECT DISTINCT * 
FROM provider 
WHERE providerName like concat('%' , userSearch , '%');
END