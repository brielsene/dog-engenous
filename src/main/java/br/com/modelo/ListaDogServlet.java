package br.com.modelo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaDogServlet
 */
@WebServlet("/listaDog")
public class ListaDogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Dog>listaDog = banco.getListaDog();
		RequestDispatcher rd = request.getRequestDispatcher("/listaDog.jsp");
		request.setAttribute("listaDog", listaDog);
		rd.forward(request, response);
	}

}
