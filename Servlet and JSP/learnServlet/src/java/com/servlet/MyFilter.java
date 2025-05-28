

package com.servlet;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;



public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {      
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chine) throws IOException, ServletException {
   
         System.out.println("Before filter");
         chine.doFilter(request, response);
         System.out.println("After filter");
         
    }

    @Override
    public void destroy() {      
    }
    
}
