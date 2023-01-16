package br.com.dogengenous.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Dog;

public class MostraDog implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		Banco banco  = new Banco();
		Integer id = Integer.valueOf(request.getParameter("id"));
		Dog dog = banco.procuraDogPeloId(id);
		request.setAttribute("dog", dog);
		return "forward:formAlteraDog.jsp";
		
		
	}

}
