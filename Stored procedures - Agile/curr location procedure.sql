CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `curr_location_procedure`(zip int(10), procedureSearch varchar(60))
BEGIN
SELECT *
  FROM procedurestable JOIN provider
    ON procedurestable.Provider_Id = provider.providerID
WHERE procedurestable.DRG_Definition like concat('%' , procedureSearch , '%') 
AND provider.providerZipCode = zip;
END