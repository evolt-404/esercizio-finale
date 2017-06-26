package esercizio.testFinale;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import esercizio.testFinale.CodiceFiscale;
import esercizio.testFinale.GestioneCF;
import esercizio.testFinale.ServicesCrud;

public class InserimentoDati extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher requestDispatcherObj = request.getRequestDispatcher("/campiCf.jsp");
		requestDispatcherObj.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



		String cognome = req.getParameter("cognome");
		String nome = req.getParameter("nome");
		String dataDiNascita = req.getParameter("dataDiNascita");
		String comuneDiNascita = req.getParameter("comuneDiNascita");

		//INVOCARE METODO CREAZIONE CODICEFISCALE

		RequestDispatcher requestDispatcherObj = req.getRequestDispatcher("/risultato.jsp");
		requestDispatcherObj.forward(req, resp);

	}


}