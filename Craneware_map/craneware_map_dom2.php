<?php

$server = 'silva.computing.dundee.ac.uk';
$username = '19agileteam1';
$password = '8760.at1.0678';
$database = '19agileteam1db';

// Start XML file, create parent node
$dom = new DOMDocument("1.0");
$node = $dom->createElement("markers");
$parnode = $dom->appendChild($node);

// Opens a connection to a MySQL server
$conn = mysql_connect ($server, $username, $password);
if (!$conn) {  die('Not connected : ' . mysql_error($conn));}

// Set the active MySQL database
$db_selected = mysql_select_db($database, $conn);
if (!$db_selected) {
  die ('Can\'t use db : ' . mysql_error($conn));
}

// Select all the rows in the markers table
$query = "SELECT * FROM map WHERE 1";
$result = mysql_query($query);
if (!$result) {
  die('Invalid query: ' . mysql_error());
}

//header("Content-type: text/xml");

// Iterate through the rows, adding XML nodes for each

while ($row = @mysql_fetch_assoc($result)){
  // Add to XML document node
  $node = $dom->createElement("marker");
  $newnode = $parnode->appendChild($node);
  $newnode->setAttribute("id", $row['map_id']);
  $newnode->setAttribute("name", $row['Provider_Name']);
  $newnode->setAttribute("address", $row['Full_Address']);
  $newnode->setAttribute("lat", $row['Latitude']);
  $newnode->setAttribute("lng", $row['Longitude']);
  $newnode->setAttribute("price", $row['Average_Medicare_Payments']);
}

echo $dom->saveXML();

?>
