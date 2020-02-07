CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `multiple_fields_search`(nameSearch VARCHAR(60), procedureSearch VARCHAR(60), address VARCHAR(60), zip int(11))
BEGIN

SELECT * 
FROM provider JOIN procedurestable
    ON procedurestable.Provider_Id = provider.providerID
WHERE provider.providerName like concat('%' , nameSearch , '%')
AND procedurestable.DRG_Definition like concat('%' , procedureSearch , '%')
AND provider.providerStreetAddress like concat('%' , address , '%')
AND provider.providerZipCode like concat('%' , zip , '%');

END