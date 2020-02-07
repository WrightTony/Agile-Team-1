<%@ page import="org.Database" %>
<%@ page  import= "java.sql.Connection"%>
<%@ page import= "java.sql.*"%>
<%@ page import ="java.util.Arrays"%>
<%@ page import ="java.util.Scanner"%>
<%@ page import ="java.util.logging.Level"%>
<%@ page import ="java.util.logging.Logger"%>
 <!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

  <title>Craneware</title>

</head>

<body>

<!-- search options left-->
  <div class="container-fluid">
    <!--<h1 style="text-align:center">Craneware</h1>-->
<div style="background-image: url('background.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;">
    <!-- Image and text -->
    <nav class="navbar navbar-light bg-light">
         <!-- page text resize button --> 
    
    <div id="resizeText">
        <button alt="Make taxt bigger" 
   title="Make text bigger" 
   onclick="textResize(1);">
   A+
</button>
<button alt="Make text smaller" 
   title="Make text smaller" 
   onclick="textResize(-1);">
   A-
</button>
        
    </div>
      <a class="navbar-brand" href="#">
        <img src="craneware_Logo.png" width="30" height="30" class="d-inline-block align-top" alt="">
        Craneware
      </a>
    </nav>
<p style ="height:3px;"> </p>
    <h1 class="display-4" style="text-align:center">Search and compare hospitals across the US</h1>
<p style ="height:3px;"> </p>
    <div class="row">
        
      <div class="card" style="width: 85rem; margin-left: auto; margin-right: auto;">
        <div class="card-body">

          <ul class="nav nav-tabs" id="myTab" role="tablist">
            <li class="nav-item">
              <a class="nav-link active" id="search-tab" data-toggle="tab" href="#search" role="tab" aria-controls="search" aria-selected="true">Search</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" id="filter-tab" data-toggle="tab" href="#filter" role="tab" aria-controls="filter" aria-selected="false">Filter</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" id="bestForYou-tab" data-toggle="tab" href="#bestForYou" role="tab" aria-controls="top" aria-selected="false">Best For You</a>
            </li>
          </ul>
          <div class="tab-content" id="myTabContent">

            <!-- Search tab -->
            <div class="tab-pane fade show active" id="search" role="tabpanel" aria-labelledby="search-tab">
              <p style ="height:10px;"> </p>
              <p style="margin-left:2rem">- Use as many or as little of the search options as you want to refine your search..</p>

              <p style ="height:3px;"> </p>

              <!-- Checkbox -->
              <div class="checkbox"style="margin-left:2rem">
                <label><input type="checkbox" onclick="checkboxClickSearch()" value=""> Use your current location</label>
              </div>
              <script>
              function checkboxClickSearch() {
                //disable address and zip search boxes when using device location
                document.getElementById("addressInputSearch").disabled = !document.getElementById("addressInputSearch").disabled;
                document.getElementById("zipInputSearch").disabled = !document.getElementById("zipInputSearch").disabled;
                //clear any input that is already in the box
                document.getElementById('addressInputSearch').value = '';
                document.getElementById('zipInputSearch').value = '';
              }
              </script>

              <form class="form-inline" style="margin-left:2rem" method="get" >

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="Search by hospital name..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="nameInputSearch" name="nameInputSearch">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="address..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="addressInputSearch" name="addressInputSearch">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="zip code..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="zipInputSearch" name="zipInputSearch">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="procedure name..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="procedureNameInputSearch" name="procedureNameInputSearch">
                </div>

               <p></p>
                  <!-- Search button -->
              <p style = "text-align:center;"><button type="submit" value="javaServerJSP" class="btn btn-outline-primary" style="width:220px; margin-left: 0.5rem; margin-top: 1rem" >Search</button></p>
              </form>

              

              
              <p></p>

            </div>

            <!-- Filter tab -->
            <div class="tab-pane fade" id="filter" role="tabpanel" aria-labelledby="filter-tab">

              <p style ="height:10px;"> </p>
              <p style="margin-left:2rem">- Use as many or as little of the search options as you want to refine your search..</p>

              <p style ="height:3px;"> </p>

              <!-- Checkbox -->
              <div class="checkbox"style="margin-left:2rem">
                <label><input type="checkbox" onclick="checkboxClickFilter()" value=""> Use your current location</label>
              </div>

              <script>
              function checkboxClickFilter() {
                // dissable address and zip search boxes if they are not already disabled
                document.getElementById("addressInputFilter").disabled = !document.getElementById("addressInputFilter").disabled;
                document.getElementById("zipInputFilter").disabled = !document.getElementById("zipInputFilter").disabled;
                //clear any input that is already in the box
                document.getElementById('addressInputFilter').value = '';
                document.getElementById('zipInputFilter').value = '';
              }
              </script>
              <form class="form-inline" style="margin-left:2rem" method="get">

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="Search by hospital name..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="nameInputSearch" name="nameInputSearch">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="address..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="addressInputSearch" name="addressInputSearch">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="zip code..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="zipInputSearch" name="zipInputSearch">
                </div>
                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="procedure name..." aria-label="Search" style="width: 15rem; margin-left: 0.5rem;" id="procedureNameInputSearch" name="procedureNameInputSearch">
                </div>

               

              <!-- select price range -->

                <div class="input-group mb-3">
                  <div class="input-group-prepend">
                    <span class="input-group-text">$</span>
                  </div>
                  <input type="text" class="form-control" placeholder="Maximum Price..." aria-label="Amount (to the nearest pound)" name="maxPrice">
                  <div class="input-group-append">
                    <span class="input-group-text">.00</span>
                  </div>
                </div>
                <br/>
                <p></p>


                <!-- select distance range -->
              <div class="input-group mb-3">
                <input type="text" class="form-control" placeholder="Maximum Distance..." aria-label="Maximum Distance" aria-describedby="basic-addon2">
                <div class="input-group-append">
                  <span class="input-group-text" id="basic-addon2">Miles</span>
                </div>
              </div>
                <br/>
                <p></p>
              
               


                <!-- dropdown select highest to lowest price -->
                <div class="input-group mb-3">
                  <div class="input-group-prepend">
                    <label class="input-group-text" for="inputGroupSelect01">Price</label>
                  </div>
                  <select class="custom-select" id="inputGroupSelect01">
                    <option selected>Choose...</option>
                    <option value="1">None</option>
                    <option value="2">Low - High</option>
                    <option value="3">High - Low</option>
                  </select>
                </div>

                <p></p>
                <!-- dropdown select closest to furthest distance -->
                <div class="input-group mb-3">
                  <div class="input-group-prepend">
                    <label class="input-group-text" for="inputGroupSelect01">Distance</label>
                  </div>
                  <select class="custom-select" id="inputGroupSelect01">
                    <option selected>Choose...</option>
                    <option value="1">None</option>
                    <option value="2">Low - High</option>
                    <option value="3">High - Low</option>
                  </select>
                </div>

               
                <p></p>
                
                <!-- Search button -->
                <p style = "text-align:center;"><button type="submit" value="javaServerJSP" class="btn btn-outline-primary" href="#filter" style="width:220px; margin-left: 0.5rem; margin-top: 1rem" >Search</button></p>

                <p></p>
                
                </div>
             </form>

            <!-- Best For You tab -->
            <div class="tab-pane fade" id="bestForYou" role="tabpanel" aria-labelledby="bestForYou-tab">

              <p style ="height:10px;"> </p>

              <p style="margin-left:2rem">- Using your search requests, we will put together a top 10 list of Hospitals matching your needs</p>

              <p style="margin-left:2rem">- You can use as many or as little of the options as you like..</p>
              <p style ="height:3px;"> </p>


              <div class="checkbox"style="margin-left:2rem">
                <label><input type="checkbox" value=""> Use your current location</label>
              </div>

              <form class="form-inline" style="margin-left:2rem">

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="Search by hospital name..." aria-label="Search" style="width: 18rem; margin-left: 0.5rem;" id="nameInput">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="Search by address..." aria-label="Search" style="width: 18rem; margin-left: 0.5rem;" id="addressInput">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="Search by zip code..." aria-label="Search" style="width: 18rem; margin-left: 0.5rem;" id="zipInput">
                </div>

                <div class="md-form mt-0">
                  <input class="form-control" type="text" placeholder="Search by procedure name..." aria-label="Search" style="width: 18rem; margin-left: 0.5rem;" id="procedureNameInput">
                </div>

              </form>

              <p></p>

              <form class="form-inline" style="margin-left:2rem">

                <div class="input-group mb-3" style="width: 44rem; margin-left: 0.5rem">
                  <div class="input-group-prepend">
                    <span class="input-group-text">$</span>
                  </div>
                  <input type="text" class="form-control" placeholder="Ideal Price..." aria-label="Amount (to the nearest pound)">
                  <div class="input-group-append">
                    <span class="input-group-text">.00</span>
                  </div>
                </div>

                <p></p>

                  <!-- dropdown select distance range -->
                <div class="input-group mb-3">
                  <input type="text" class="form-control" placeholder="Ideal Distance..." aria-label="Maximum Distance" aria-describedby="basic-addon2" style="width: 44rem; margin-left: 0.5rem">
                  <div class="input-group-append">
                    <span class="input-group-text" id="basic-addon2">Miles</span>
                  </div>
                </div>

                <p></p>

              </form>


            </div>
          

          </div>
            </div>
          </div>
            <div>
            <p style ="height:15px;"> </p>
          </div>

          </div>

          <hr>
    </div>

          <div class="container-fluid">
       <div class="row">
         <div class = "col-sm-6">
           <!-- search results -->
           <h3 class="display-5" style="text-align:center">Search Results</h3>
           <hr>
           
            <% try { 
                Database db = new Database();
                
                String[] addressSearch = new String[1];
                String[] nameSearch = new String[1];
                String[] zipSearch = new String[1];
                String[] procedureSearch = new String[1];
                String[] maxPrice = new String[1];
                addressSearch[0] = "";
                maxPrice[0] = "";
                nameSearch[0] = "";
                zipSearch[0] = "";
                procedureSearch[0] = "";
                if(request.getParameter("maxPrice")!=null){
                    maxPrice = request.getParameterValues("maxPrice");
                }
                if(request.getParameterValues("addressInputSearch")!= null){
                    addressSearch = request.getParameterValues("addressInputSearch");
                }
                
                if(request.getParameterValues("nameInputSearch")!= null){
                    nameSearch = request.getParameterValues("nameInputSearch");
                }
                
                if(request.getParameterValues("zipInputSearch")!= null){
                    zipSearch = request.getParameterValues("zipInputSearch");
                }
                
                
                if(request.getParameterValues("procedureNameInputSearch")!= null){
                    procedureSearch = request.getParameterValues("procedureNameInputSearch");
                }
            
            if(addressSearch[0]=="" && nameSearch[0]=="" && zipSearch[0]=="" && procedureSearch[0]==""){
            }
            else{
                //result = db.runSearchAddressP(addressSearch[0]);
            int counter;
                    if(maxPrice[0]!=""){
                        double maxPriceDouble = Double.parseDouble(maxPrice[0]);
                        ResultSet result = db.runRestrictPriceP(0, maxPriceDouble);
                        
                        counter = 0;
                         
                        if(result!=null){
                           
                        while(result.next() && counter<10){


                        %>
                        <div class ="container p-3 my-3 border">
                                <h1><%= result.getString("providerName") %></h1>
                          <p><%= result.getString("providerStreetAddress") %></p>
                          <p><%= result.getString("DRG_Definition")%></p>
                          <p>Average medical care payments: $<%= result.getDouble("Average_Medicare_Payments")%></p>

                        </div>

                            <% counter++;
                            }
                        }
                        
                    }
                    if(nameSearch[0]!=""){
                        ResultSet result = db.runSearchNameP(nameSearch[0]);
                        
                        
                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){
                            
                        
                            %>
                            <div class ="container p-3 my-3 border">

                                    <h2><%= result.getString("providerName") %></h2>
                              <p><%= result.getString("providerStreetAddress") %></p>
                              <p><%= result.getString("providerCity") %></p>
                              <p><%= result.getString("providerState") %></p>


                            </div>

                            <% counter++;
                            
                        }
                        }
                    }
                    if(zipSearch[0]!=""){
                        int i = Integer.parseInt(zipSearch[0]);
                        ResultSet result = db.runSearchZipP(i);

                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){


                        %>
                        <div class ="container p-3 my-3 border">

                                <h1><%= result.getString("providerName") %></h1>
                                <p><%= result.getString("providerStreetAddress") %></p>
                                <p><%= result.getString("providerCity") %></p>
                                <p><%= result.getString("providerState") %></p>


                        </div>

                            <% counter++;
                            }
                        }
                    }
                    if(procedureSearch[0]!=""){
                        ResultSet result = db.runSearchConditionP(procedureSearch[0]);
                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){


                        %>
                        <div class ="container p-3 my-3 border">
                                <h1><%= result.getString("providerName") %></h1>
                          <p><%= result.getString("providerStreetAddress") %></p>
                          <p><%= result.getString("providerCity") %></p>
                              <p><%= result.getString("providerState") %></p>
                          <p><%= result.getString("DRG_Definition")%></p>
                          <p>Average medical care payments: $<%= result.getDouble("Average_Medicare_Payments")%></p>

                        </div>

                            <% counter++;
                            }
                        }
                    }
                    if(addressSearch[0]!=""){
                        ResultSet result = db.runSearchAddressP(addressSearch[0]);
                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){
 

                        %>
                        <div class ="container p-3 my-3 border">

                                <h1><%= result.getString("providerName") %></h1>
                                <p><%= result.getString("providerStreetAddress") %></p>
                                <p><%= result.getString("providerCity") %></p>
                                <p><%= result.getString("providerState") %></p>

                        </div>

                            <% counter++;
                            }
                        }
                    }

}


        } catch (SQLException ex) {
                    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }

            %>
          

           

           <a id="display"></a>

         </div>

         <div class = "col-sm-6">

           <div class="card sticky-top" style = "text-align: center; padding-left:40px;">
             <!-- map -->
             
               <iframe src="https://www.google.com/maps/d/u/0/embed?mid=1rKyzzZcUR_zFjwAkFWqQOIoJ7B4iIbvl" width="640" height="480"></iframe>

           </div>


         </div>

       </div>
            
            <script>
function textResize(al) {
var el = document.getElementsByTagName('body')[0]; 
     // only one body in document
  var fontStr = window
     .getComputedStyle(el, null)
     .getPropertyValue('font-size');
  var fontSize = parseFloat(fontStr); 
  el.style.fontSize = (fontSize + al) + 'px';
    // Must be done separately for buttons:
  var els = document.getElementsByTagName('button');
  for (var i = 0; i < els.length; i++) {
     fontStr = window
        .getComputedStyle(els[i], null)
        .getPropertyValue('font-size');
     var fontSize = parseFloat(fontStr); 
     els[i].style.fontSize = (fontSize + al) + 'px';
  }
 }
</script>


   </body>

</html>
<!--
            
