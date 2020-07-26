package com.gui.servlet;

import com.gui.bean.Employee;
import com.gui.dao.Dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Dao dao = new Dao();
        Employee employee = dao.getById(req.getParameter("id"));
        if(employee.getLast_name().equals(req.getParameter("name"))){
            resp.sendRedirect("success.jsp");
            //req.getRequestDispatcher("success.jsp").forward(req,resp);
        }else{
            resp.sendRedirect("index.jsp");
        }
    }
}
