<?php

$server = 'silva.computing.dundee.ac.uk';
$username = '19agileteam1';
$password = '8760.at1.0678';
$database = '19agileteam1db';

// Start XML file, create parent node
$doc = domxml_new_doc("1.0");
$node = $doc->create_element("markers");
$parnode = $doc->append_child($node);

// Opens a connection to a MySQL server
$conn = mysql_connect ($server, $username, $password);
if (!$connection) {
  die('Not connected : ' . mysql_error($conn));
}

// Set the active MySQL database
$db_selected = mysql_select_db($database, $conn);
if (!$db_selected) {
  die ('Can\'t use db : ' . mysql_error($conn));
}

// Select all the rows in the markers table
$query = "SELECT * FROM provider_map_id WHERE 1";
$result = mysql_query($conn, $query);
if (!$result) {
  die('Invalid query: ' . mysql_error());
}

//header("Content-type: text/xml");

// Iterate through the rows, adding XML nodes for each
while ($row = @mysql_fetch_assoc($result)){
  // Add to XML document node
  $node = $doc->create_element("marker");
  $newnode = $parnode->append_child($node);

  $newnode->set_attribute("id", $row['provider_map_id_id']);
  $newnode->set_attribute("name", $row['Provider_name']);
  $newnode->set_attribute("address", $row['Full_address']);
  $newnode->set_attribute("lat", $row['Latitude']);
  $newnode->set_attribute("lng", $row['Longitude']);
  $newnode->set_attribute("price", $row['Average_Medicare_Payments']);
}

$xmlfile = $doc->dump_mem();
echo $xmlfile;

?>
