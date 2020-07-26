package com.gui.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet(urlPatterns = "/Servlet2")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if(ServletFileUpload.isMultipartContent(request)){
            ServletFileUpload fileUpload = new ServletFileUpload(new DiskFileItemFactory());
            try {
                List<FileItem> items = fileUpload.parseRequest(request);
                for(FileItem item : items){
                    if(item.isFormField()){
                        System.out.println(item.getFieldName() + ":" + item.getString());
                    }else {
                        item.write(new File("D://",item.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
