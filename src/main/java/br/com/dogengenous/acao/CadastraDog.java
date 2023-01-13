package br.com.dogengenous.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Dog;

public class CadastraDog {
	
	public void executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		Banco banco = new Banco();
		banco.adicionaDog(new Dog(request.getParameter("nome"),request.getParameter("raca"), Integer.valueOf(request.getParameter("idade"))));
		RequestDispatcher rd = request.getRequestDispatcher("entrada?acao=ListaDogs");
		rd.forward(request, response);
	}

}
