package br.com.modelo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlteraDogServlet
 */
//@WebServlet("/alteraDog")
public class AlteraDogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Banco banco = new Banco();
		
		Dog dog = banco.procuraDogPeloId(id);
		dog.setIdade(Integer.valueOf(request.getParameter("idade")));
		dog.setNome(request.getParameter("nome"));
		dog.setRaca(request.getParameter("raca"));
		
		
		response.sendRedirect("listaDog");
	}

}
