package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.Database;
import java.sql.Connection;
import java.sql.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class javaServerJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  <title>Craneware</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- search options left-->\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <!--<h1 style=\"text-align:center\">Craneware</h1>-->\n");
      out.write("<div style=\"background-image: url('background.jpg');\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-attachment: fixed;\n");
      out.write("  background-size: 100% 100%;\">\n");
      out.write("    <!-- Image and text -->\n");
      out.write("    <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("        <img src=\"craneware_Logo.png\" width=\"30\" height=\"30\" class=\"d-inline-block align-top\" alt=\"\">\n");
      out.write("        Craneware\n");
      out.write("      </a>\n");
      out.write("    </nav>\n");
      out.write("<p style =\"height:3px;\"> </p>\n");
      out.write("    <h1 class=\"display-4\" style=\"text-align:center\">Search and compare hospitals across the US</h1>\n");
      out.write("<p style =\"height:3px;\"> </p>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("      <div class=\"card\" style=\"width: 85rem; margin-left: auto; margin-right: auto;\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("          <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link active\" id=\"search-tab\" data-toggle=\"tab\" href=\"#search\" role=\"tab\" aria-controls=\"search\" aria-selected=\"true\">Search</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" id=\"filter-tab\" data-toggle=\"tab\" href=\"#filter\" role=\"tab\" aria-controls=\"filter\" aria-selected=\"false\">Filter</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\" id=\"bestForYou-tab\" data-toggle=\"tab\" href=\"#bestForYou\" role=\"tab\" aria-controls=\"top\" aria-selected=\"false\">Best For You</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("\n");
      out.write("            <!-- Search tab -->\n");
      out.write("            <div class=\"tab-pane fade show active\" id=\"search\" role=\"tabpanel\" aria-labelledby=\"search-tab\">\n");
      out.write("              <p style =\"height:10px;\"> </p>\n");
      out.write("              <p style=\"margin-left:2rem\">- Use as many or as little of the search options as you want to refine your search..</p>\n");
      out.write("\n");
      out.write("              <p style =\"height:3px;\"> </p>\n");
      out.write("\n");
      out.write("              <!-- Checkbox -->\n");
      out.write("              <div class=\"checkbox\"style=\"margin-left:2rem\">\n");
      out.write("                <label><input type=\"checkbox\" onclick=\"checkboxClickSearch()\" value=\"\"> Use your current location</label>\n");
      out.write("              </div>\n");
      out.write("              <script>\n");
      out.write("              function checkboxClickSearch() {\n");
      out.write("                //disable address and zip search boxes when using device location\n");
      out.write("                document.getElementById(\"addressInputSearch\").disabled = !document.getElementById(\"addressInputSearch\").disabled;\n");
      out.write("                document.getElementById(\"zipInputSearch\").disabled = !document.getElementById(\"zipInputSearch\").disabled;\n");
      out.write("                //clear any input that is already in the box\n");
      out.write("                document.getElementById('addressInputSearch').value = '';\n");
      out.write("                document.getElementById('zipInputSearch').value = '';\n");
      out.write("              }\n");
      out.write("              </script>\n");
      out.write("\n");
      out.write("              <form class=\"form-inline\" style=\"margin-left:2rem\" method=\"get\" >\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"Search by hospital name...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"nameInputSearch\" name=\"nameInputSearch\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"address...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"addressInputSearch\" name=\"addressInputSearch\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"zip code...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"zipInputSearch\" name=\"zipInputSearch\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"procedure name...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"procedureNameInputSearch\" name=\"procedureNameInputSearch\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               <p></p>\n");
      out.write("                  <!-- Search button -->\n");
      out.write("              <p style = \"text-align:center;\"><button type=\"submit\" value=\"javaServerJSP\" class=\"btn btn-outline-primary\" style=\"width:220px; margin-left: 0.5rem; margin-top: 1rem\" >Search</button></p>\n");
      out.write("              </form>\n");
      out.write("\n");
      out.write("              \n");
      out.write("\n");
      out.write("              \n");
      out.write("              <p></p>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Filter tab -->\n");
      out.write("            <div class=\"tab-pane fade\" id=\"filter\" role=\"tabpanel\" aria-labelledby=\"filter-tab\">\n");
      out.write("\n");
      out.write("              <p style =\"height:10px;\"> </p>\n");
      out.write("              <p style=\"margin-left:2rem\">- Use as many or as little of the search options as you want to refine your search..</p>\n");
      out.write("\n");
      out.write("              <p style =\"height:3px;\"> </p>\n");
      out.write("\n");
      out.write("              <!-- Checkbox -->\n");
      out.write("              <div class=\"checkbox\"style=\"margin-left:2rem\">\n");
      out.write("                <label><input type=\"checkbox\" onclick=\"checkboxClickFilter()\" value=\"\"> Use your current location</label>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <script>\n");
      out.write("              function checkboxClickFilter() {\n");
      out.write("                // dissable address and zip search boxes if they are not already disabled\n");
      out.write("                document.getElementById(\"addressInputFilter\").disabled = !document.getElementById(\"addressInputFilter\").disabled;\n");
      out.write("                document.getElementById(\"zipInputFilter\").disabled = !document.getElementById(\"zipInputFilter\").disabled;\n");
      out.write("                //clear any input that is already in the box\n");
      out.write("                document.getElementById('addressInputFilter').value = '';\n");
      out.write("                document.getElementById('zipInputFilter').value = '';\n");
      out.write("              }\n");
      out.write("              </script>\n");
      out.write("              <form class=\"form-inline\" style=\"margin-left:2rem\" method=\"get\">\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"Search by hospital name...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"nameInputSearch\" name=\"nameInputSearch\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"address...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"addressInputSearch\" name=\"addressInputSearch\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"zip code...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"zipInputSearch\" name=\"zipInputSearch\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"procedure name...\" aria-label=\"Search\" style=\"width: 15rem; margin-left: 0.5rem;\" id=\"procedureNameInputSearch\" name=\"procedureNameInputSearch\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("              <!-- select price range -->\n");
      out.write("\n");
      out.write("                <div class=\"input-group mb-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                    <span class=\"input-group-text\">$</span>\n");
      out.write("                  </div>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" placeholder=\"Maximum Price...\" aria-label=\"Amount (to the nearest pound)\" name=\"maxPrice\">\n");
      out.write("                  <div class=\"input-group-append\">\n");
      out.write("                    <span class=\"input-group-text\">.00</span>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <br/>\n");
      out.write("                <p></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- select distance range -->\n");
      out.write("              <div class=\"input-group mb-3\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Maximum Distance...\" aria-label=\"Maximum Distance\" aria-describedby=\"basic-addon2\">\n");
      out.write("                <div class=\"input-group-append\">\n");
      out.write("                  <span class=\"input-group-text\" id=\"basic-addon2\">Miles</span>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("                <br/>\n");
      out.write("                <p></p>\n");
      out.write("              \n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- dropdown select highest to lowest price -->\n");
      out.write("                <div class=\"input-group mb-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                    <label class=\"input-group-text\" for=\"inputGroupSelect01\">Price</label>\n");
      out.write("                  </div>\n");
      out.write("                  <select class=\"custom-select\" id=\"inputGroupSelect01\">\n");
      out.write("                    <option selected>Choose...</option>\n");
      out.write("                    <option value=\"1\">None</option>\n");
      out.write("                    <option value=\"2\">Low - High</option>\n");
      out.write("                    <option value=\"3\">High - Low</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p></p>\n");
      out.write("                <!-- dropdown select closest to furthest distance -->\n");
      out.write("                <div class=\"input-group mb-3\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                    <label class=\"input-group-text\" for=\"inputGroupSelect01\">Distance</label>\n");
      out.write("                  </div>\n");
      out.write("                  <select class=\"custom-select\" id=\"inputGroupSelect01\">\n");
      out.write("                    <option selected>Choose...</option>\n");
      out.write("                    <option value=\"1\">None</option>\n");
      out.write("                    <option value=\"2\">Low - High</option>\n");
      out.write("                    <option value=\"3\">High - Low</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("                <p></p>\n");
      out.write("                \n");
      out.write("                <!-- Search button -->\n");
      out.write("                <p style = \"text-align:center;\"><button type=\"submit\" value=\"javaServerJSP\" class=\"btn btn-outline-primary\" href=\"#filter\" style=\"width:220px; margin-left: 0.5rem; margin-top: 1rem\" >Search</button></p>\n");
      out.write("\n");
      out.write("                <p></p>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("             </form>\n");
      out.write("\n");
      out.write("            <!-- Best For You tab -->\n");
      out.write("            <div class=\"tab-pane fade\" id=\"bestForYou\" role=\"tabpanel\" aria-labelledby=\"bestForYou-tab\">\n");
      out.write("\n");
      out.write("              <p style =\"height:10px;\"> </p>\n");
      out.write("\n");
      out.write("              <p style=\"margin-left:2rem\">- Using your search requests, we will put together a top 10 list of Hospitals matching your needs</p>\n");
      out.write("\n");
      out.write("              <p style=\"margin-left:2rem\">- You can use as many or as little of the options as you like..</p>\n");
      out.write("              <p style =\"height:3px;\"> </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("              <div class=\"checkbox\"style=\"margin-left:2rem\">\n");
      out.write("                <label><input type=\"checkbox\" value=\"\"> Use your current location</label>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <form class=\"form-inline\" style=\"margin-left:2rem\">\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"Search by hospital name...\" aria-label=\"Search\" style=\"width: 18rem; margin-left: 0.5rem;\" id=\"nameInput\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"Search by address...\" aria-label=\"Search\" style=\"width: 18rem; margin-left: 0.5rem;\" id=\"addressInput\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"Search by zip code...\" aria-label=\"Search\" style=\"width: 18rem; margin-left: 0.5rem;\" id=\"zipInput\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"md-form mt-0\">\n");
      out.write("                  <input class=\"form-control\" type=\"text\" placeholder=\"Search by procedure name...\" aria-label=\"Search\" style=\"width: 18rem; margin-left: 0.5rem;\" id=\"procedureNameInput\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </form>\n");
      out.write("\n");
      out.write("              <p></p>\n");
      out.write("\n");
      out.write("              <form class=\"form-inline\" style=\"margin-left:2rem\">\n");
      out.write("\n");
      out.write("                <div class=\"input-group mb-3\" style=\"width: 44rem; margin-left: 0.5rem\">\n");
      out.write("                  <div class=\"input-group-prepend\">\n");
      out.write("                    <span class=\"input-group-text\">$</span>\n");
      out.write("                  </div>\n");
      out.write("                  <input type=\"text\" class=\"form-control\" placeholder=\"Ideal Price...\" aria-label=\"Amount (to the nearest pound)\">\n");
      out.write("                  <div class=\"input-group-append\">\n");
      out.write("                    <span class=\"input-group-text\">.00</span>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p></p>\n");
      out.write("\n");
      out.write("                  <!-- dropdown select distance range -->\n");
      out.write("                <div class=\"input-group mb-3\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" placeholder=\"Ideal Distance...\" aria-label=\"Maximum Distance\" aria-describedby=\"basic-addon2\" style=\"width: 44rem; margin-left: 0.5rem\">\n");
      out.write("                  <div class=\"input-group-append\">\n");
      out.write("                    <span class=\"input-group-text\" id=\"basic-addon2\">Miles</span>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p></p>\n");
      out.write("\n");
      out.write("              </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            <div>\n");
      out.write("            <p style =\"height:15px;\"> </p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <hr>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"container-fluid\">\n");
      out.write("       <div class=\"row\">\n");
      out.write("         <div class = \"col-sm-6\">\n");
      out.write("           <!-- search results -->\n");
      out.write("           <h3 class=\"display-5\" style=\"text-align:center\">Search Results</h3>\n");
      out.write("           <hr>\n");
      out.write("           \n");
      out.write("            ");
 try { 
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


                        
      out.write("\n");
      out.write("                        <div class =\"container p-3 my-3 border\">\n");
      out.write("                                <h1>");
      out.print( result.getString("providerName") );
      out.write("</h1>\n");
      out.write("                          <p>");
      out.print( result.getString("providerStreetAddress") );
      out.write("</p>\n");
      out.write("                          <p>");
      out.print( result.getString("DRG_Definition"));
      out.write("</p>\n");
      out.write("                          <p>Average medical care payments: $");
      out.print( result.getDouble("Average_Medicare_Payments"));
      out.write("</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                            ");
 counter++;
                            }
                        }
                        
                    }
                    if(nameSearch[0]!=""){
                        ResultSet result = db.runSearchNameP(nameSearch[0]);
                        
                        
                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){
                            
                        
                            
      out.write("\n");
      out.write("                            <div class =\"container p-3 my-3 border\">\n");
      out.write("\n");
      out.write("                                    <h2>");
      out.print( result.getString("providerName") );
      out.write("</h2>\n");
      out.write("                              <p>");
      out.print( result.getString("providerStreetAddress") );
      out.write("</p>\n");
      out.write("                              <p>");
      out.print( result.getString("providerCity") );
      out.write("</p>\n");
      out.write("                              <p>");
      out.print( result.getString("providerState") );
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");
 counter++;
                            
                        }
                        }
                    }
                    if(zipSearch[0]!=""){
                        int i = Integer.parseInt(zipSearch[0]);
                        ResultSet result = db.runSearchZipP(i);

                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){


                        
      out.write("\n");
      out.write("                        <div class =\"container p-3 my-3 border\">\n");
      out.write("\n");
      out.write("                                <h1>");
      out.print( result.getString("providerName") );
      out.write("</h1>\n");
      out.write("                                <p>");
      out.print( result.getString("providerStreetAddress") );
      out.write("</p>\n");
      out.write("                                <p>");
      out.print( result.getString("providerCity") );
      out.write("</p>\n");
      out.write("                                <p>");
      out.print( result.getString("providerState") );
      out.write("</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                            ");
 counter++;
                            }
                        }
                    }
                    if(procedureSearch[0]!=""){
                        ResultSet result = db.runSearchConditionP(procedureSearch[0]);
                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){


                        
      out.write("\n");
      out.write("                        <div class =\"container p-3 my-3 border\">\n");
      out.write("                                <h1>");
      out.print( result.getString("providerName") );
      out.write("</h1>\n");
      out.write("                          <p>");
      out.print( result.getString("providerStreetAddress") );
      out.write("</p>\n");
      out.write("                          <p>");
      out.print( result.getString("providerCity") );
      out.write("</p>\n");
      out.write("                              <p>");
      out.print( result.getString("providerState") );
      out.write("</p>\n");
      out.write("                          <p>");
      out.print( result.getString("DRG_Definition"));
      out.write("</p>\n");
      out.write("                          <p>Average medical care payments: $");
      out.print( result.getDouble("Average_Medicare_Payments"));
      out.write("</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                            ");
 counter++;
                            }
                        }
                    }
                    if(addressSearch[0]!=""){
                        ResultSet result = db.runSearchAddressP(addressSearch[0]);
                        counter = 0;
                        if(result!=null){
                        while(result.next() && counter<10){


                        
      out.write("\n");
      out.write("                        <div class =\"container p-3 my-3 border\">\n");
      out.write("\n");
      out.write("                                <h1>");
      out.print( result.getString("providerName") );
      out.write("</h1>\n");
      out.write("                                <p>");
      out.print( result.getString("providerStreetAddress") );
      out.write("</p>\n");
      out.write("                                <p>");
      out.print( result.getString("providerCity") );
      out.write("</p>\n");
      out.write("                                <p>");
      out.print( result.getString("providerState") );
      out.write("</p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                            ");
 counter++;
                            }
                        }
                    }

}


        } catch (SQLException ex) {
                    Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }

            
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("           <a id=\"display\"></a>\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("         <div class = \"col-sm-6\">\n");
      out.write("\n");
      out.write("           <div class=\"card sticky-top\" style = \"text-align: center; padding-left:40px;\">\n");
      out.write("             <!-- map -->\n");
      out.write("             \n");
      out.write("               <iframe src=\"https://www.google.com/maps/d/u/0/embed?mid=1rKyzzZcUR_zFjwAkFWqQOIoJ7B4iIbvl\" width=\"640\" height=\"480\"></iframe>\n");
      out.write("\n");
      out.write("           </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!--\n");
      out.write("            \n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
