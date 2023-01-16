package br.com.dogengenous.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Dog;

public class AlteraDog implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		Banco banco = new Banco();
		
		Dog dog = banco.procuraDogPeloId(id);
		dog.setIdade(Integer.valueOf(request.getParameter("idade")));
		dog.setNome(request.getParameter("nome"));
		dog.setRaca(request.getParameter("raca"));
		
		
		return"redirect:entrada?acao=ListaDogs";
		
	}

}
