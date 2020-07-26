package com.gui.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter",urlPatterns = "/*",dispatcherTypes = DispatcherType.REQUEST)
public class Filter implements javax.servlet.Filter {
    public void destroy() {
        System.out.println("FilterDestroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("hello,world");
        //req.getRequestDispatcher("index.jsp").forward(req,resp);
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("FilterInit");
    }

}
