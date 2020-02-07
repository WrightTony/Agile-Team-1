CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_address`(userSearch VARCHAR(50))
BEGIN
SELECT DISTINCT * 
FROM provider 
WHERE providerStreetAddress like concat('%' , userSearch , '%');
END