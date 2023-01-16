package br.com.dogengenous.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.modelo.Banco;
import br.com.modelo.Dog;

public class FormCadastraDog implements Acao {
	
	public String executa(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		return"forward:formCadastraDog.jsp";
		
	}

}
