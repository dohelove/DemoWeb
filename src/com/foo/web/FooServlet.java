package com.foo.web;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet( urlPatterns = "/foo")
public class FooServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws IOException
	{
	      ServletOutputStream out = resp.getOutputStream();
	      out.print("It works!!");
	}
}
