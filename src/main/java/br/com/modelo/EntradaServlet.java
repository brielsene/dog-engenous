package br.com.modelo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.dogengenous.acao.AlteraDog;
import br.com.dogengenous.acao.CadastraDog;
import br.com.dogengenous.acao.ListaDogs;
import br.com.dogengenous.acao.MostraDog;
import br.com.dogengenous.acao.RemoveDog;

/**
 * Servlet implementation class EntradaServlet
 */
@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		if(paramAcao.equals("ListaDogs")) {
			ListaDogs listaDogs = new ListaDogs();
			listaDogs.executa(request, response);
		}else if (paramAcao.equals("RemoveDog")) {
			RemoveDog removeDog = new RemoveDog();
			removeDog.executa(request, response);
		}else if (paramAcao.equals("MostraDog")) {
			MostraDog mostraDog = new MostraDog();
			mostraDog.executa(request, response);
		}else if (paramAcao.equals("AlteraDog")) {
			AlteraDog alteraDog = new AlteraDog();
			alteraDog.executa(request, response);
		}else if(paramAcao.equals("CadastraDog")) {
			CadastraDog cadastraDog = new CadastraDog();
			cadastraDog.executa(request, response);
		}
	}

}
