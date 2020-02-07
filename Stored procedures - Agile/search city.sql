CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_city`(user_search VARCHAR (30))
BEGIN
SELECT *
FROM provider JOIN procedurestable
    ON procedurestable.Provider_Id = provider.providerID
WHERE provider.providerCity like concat('%' , user_search , '%');
END