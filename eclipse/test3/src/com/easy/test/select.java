package com.easy.test;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.easy.util.Customer;
import com.easy.util.JDBCUtil;

/**
 * Servlet implementation class select
 */
@WebServlet("/select")
public class select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		String sql = null;
		
		if(!id.equals(""))
		{
			if (!name.equals("")) {
				sql = "select * from customerno where id ="+ id +" and name ="+"'"+ name +"'";
			}
			else {
				sql = "select * from customerno where id ="+ id;
			}
		}
		else if(!name.equals("")){
			sql = "select * from customerno where name ="+"'"+ name +"'";
		}
		else {
			sql = "select * from customerno";
		}
		//String sql = "select * from customerno where id ="+ id +" and name ="+"'"+ name +"'";
		
		List<Customer> list = JDBCUtil.getCustomers(sql);
		//��list�浽��request�У���Ϊ���ԣ����ֽ���all
		request.setAttribute("all", list);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}