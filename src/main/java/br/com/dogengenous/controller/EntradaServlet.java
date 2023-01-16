package br.com.dogengenous.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dogengenous.acao.Acao;
import br.com.dogengenous.acao.AlteraDog;
import br.com.dogengenous.acao.CadastraDog;
import br.com.dogengenous.acao.FormCadastraDog;
import br.com.dogengenous.acao.ListaDogs;
import br.com.dogengenous.acao.MostraDog;
import br.com.dogengenous.acao.RemoveDog;

/**
 * Servlet implementation class EntradaServlet
 */
@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		String nome = null;
		String nomeDaClasse = "br.com.dogengenous.acao"+paramAcao;
		
//		try {
//			Class classe = Class.forName(nomeDaClasse);//carrega a classe com o nome da String;
//			Acao acao = (Acao) classe.newInstance();
//			nome=acao.executa(request, response);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
//				| IOException e) {
//			throw new ServletException(e);
//		}
		
		
		
		
		if(paramAcao.equals("ListaDogs")) {
			ListaDogs listaDogs = new ListaDogs();
			nome = listaDogs.executa(request, response);
		}else if (paramAcao.equals("RemoveDog")) {
			RemoveDog removeDog = new RemoveDog();
			nome = removeDog.executa(request, response);
		}else if (paramAcao.equals("MostraDog")) {
			MostraDog mostraDog = new MostraDog();
			nome = mostraDog.executa(request, response);
		}else if (paramAcao.equals("AlteraDog")) {
			AlteraDog alteraDog = new AlteraDog();
			nome = alteraDog.executa(request, response);
		}else if(paramAcao.equals("CadastraDog")) {
			CadastraDog cadastraDog = new CadastraDog();
			nome = cadastraDog.executa(request, response);
		}else if (paramAcao.equals("FormCadastraDog")) {
			FormCadastraDog formCadastraDog = new FormCadastraDog();
			nome = formCadastraDog.executa(request, response);
		}
		
		String[] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")) {
		RequestDispatcher rd  = request.getRequestDispatcher("/WEB-INF/view/"+tipoEEndereco[1]);
		rd.forward(request, response);
		}else {
			response.sendRedirect(tipoEEndereco[1]);
		}
		
		
		
	}

}
