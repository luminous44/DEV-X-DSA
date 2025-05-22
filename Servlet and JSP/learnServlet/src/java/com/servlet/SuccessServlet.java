
package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SuccessServlet extends HttpServlet {
    
    public void doPost(HttpServletRequest res, HttpServletResponse resp) throws ServletException, IOException{
        
        resp.setContentType("text/plain");
        
        PrintWriter out = resp.getWriter();
        
        out.println("Successfully registration "+res.getParameter("user_name"));
        
        
        
        
    }
    
}
