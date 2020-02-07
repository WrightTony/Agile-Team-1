CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `restrict_price`(min DECIMAL(15,7), max DECIMAL(15,7))
BEGIN
SELECT * 
FROM provider JOIN procedurestable
    ON procedurestable.Provider_Id = provider.providerID
WHERE procedurestable.Average_Total_Payments BETWEEN min AND max;
END