package br.com.modelo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraCaoServlet
 */
//@WebServlet("/mostraCao")
public class MostraCaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco  = new Banco();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Dog dog = banco.procuraDogPeloId(id);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraDog.jsp");
		request.setAttribute("dog", dog);
		rd.forward(request, response);
		
		
	}

}
