CREATE DEFINER=`19agileteam1`@`%` PROCEDURE `get_procedure_locations`()
BEGIN
SELECT DISTINCT Provider_Zip_Code, Longitude, Latitude FROM 19agileteam1db.provider_map_id;
END