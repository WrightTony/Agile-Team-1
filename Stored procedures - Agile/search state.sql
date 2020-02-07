CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_state`(userSearch VARCHAR(3))
BEGIN
SELECT * 
FROM provider JOIN procedurestable
    ON procedurestable.Provider_Id = provider.providerID
WHERE provider.providerState like concat('%' , userSearch , '%');
END