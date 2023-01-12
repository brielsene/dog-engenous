package br.com.modelo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DogCadastradoServlet
 */
@WebServlet("/dogCadastrado")
public class DogCadastradoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		Dog dog = new Dog(request.getParameter("nome"), request.getParameter("raca"),
				Integer.valueOf(request.getParameter("idade")));
		banco.adicionaDog(dog);
		RequestDispatcher rd = request.getRequestDispatcher("/cadastradoDog.jsp");
		request.setAttribute("lista", banco.getListaDog());
		rd.forward(request, response);
		
	}

}
