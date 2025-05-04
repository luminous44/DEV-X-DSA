
package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Registration extends HttpServlet{
    
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
    res.setContentType("text/html");
    PrintWriter out = res.getWriter();
    out.println("<h4>Welcome to servelet</h4>");
    
    String name = req.getParameter("user_name");
    String pass = req.getParameter("user_password");
    String email = req.getParameter("user_email");
    String gender = req.getParameter("user_gender");
    String course = req.getParameter("user_course");
    String con = req.getParameter("condition");
    
    if(con != null){
        
        out.println("<h5> name : "+name);
        out.println("<h5> password : "+pass);
        out.println("<h5> email : "+email);
        out.println("<h5> gender : "+gender);
        out.println("<h5> course : "+course);
        
    }else{
        out.println("<h5> You didn't accepts terms and conditions!! try again </h5>");
      
    }
    
    
   }
}
