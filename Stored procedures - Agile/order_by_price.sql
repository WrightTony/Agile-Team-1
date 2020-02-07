CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `order_by_price`(min DECIMAL(15,7), max DECIMAL(15,7))
BEGIN
SELECT * 
FROM provider JOIN procedurestable
    ON procedurestable.Provider_Id = provider.providerID
ORDER BY procedurestable.avgTotalPayments;
END