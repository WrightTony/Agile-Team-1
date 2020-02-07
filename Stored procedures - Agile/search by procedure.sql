CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_by_procedure`(user_search VARCHAR (80))
BEGIN
SELECT *
  FROM procedurestable JOIN provider
    ON procedurestable.Provider_Id = provider.providerID
WHERE procedurestable.DRG_Definition like concat('%' , user_search , '%');
END