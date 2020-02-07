CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_price_and_procedure`(min DECIMAL(15,7), max DECIMAL(15,7), procedure_search VARCHAR(80))
BEGIN
SELECT * 
FROM provider JOIN procedurestable
    ON procedurestable.Provider_Id = provider.providerID
WHERE procedurestable.DRG_Definition like concat('%' , procedure_search , '%') AND procedurestable.Average_Total_Payments BETWEEN min AND max;
END