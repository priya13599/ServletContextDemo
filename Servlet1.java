package com.nucleus.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		writer.println("Welcome "+userid);
		writer.println("<br>");
		
		
		ServletContext context = getServletContext();
		/*String drivername = context.getInitParameter("drivername");
		writer.println("DriverName is : "+drivername);*/
		String string="";
		Enumeration<String> enumeration = context.getInitParameterNames();
		writer.println("Context Parameter Related Details : ");
		writer.println("<br>");
		while(enumeration.hasMoreElements())
		{   string = enumeration.nextElement();
			writer.println(context.getInitParameter(string));
			writer.println("<br>");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
