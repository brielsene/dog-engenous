package br.com.dogengenous.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Dog;

public class ListaDogs implements Acao {
	
	public String executa (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		Banco banco = new Banco();
		List<Dog>listaDog = banco.getListaDog();
		request.setAttribute("listaDog", listaDog);
		return ("forward:listaDog.jsp");
		
		
	}

}
