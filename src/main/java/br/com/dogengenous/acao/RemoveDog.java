package br.com.dogengenous.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;

public class RemoveDog {
	
	public void executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		Banco banco = new Banco();
		Integer id = Integer.valueOf(request.getParameter("id"));
		banco.removeDogPeloId(id);
		
		response.sendRedirect("entrada?acao=ListaDogs");
	}

}
