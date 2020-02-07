CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `search_latlong_zip`(zip INT)
BEGIN
SELECT * FROM lat_and_long
WHERE ZipCode = zip;
END