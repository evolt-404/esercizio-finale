<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="esercizio.testFinale.CodiceFiscale"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci Dati</title>
</head>
<body>
	
	<form action="CodiceFiscale" method="post">

		Cognome: <br /> <input type="text" name="cognome"><br />
		Nome: <br /> <input type="text" name="nome"><br />
		Data di Nascita<br /> <input type="text" name="dataDiNascita" placeholder="gg/mm/aaaa"><br />
		Comune di Nascita<br /> <input type="text" name="comuneDiNascita"><br />

		<select name="sesso">
			<option value="M">M</option>
			<option value="F">F</option>
		</select> <br> <br> <input type="submit">
	</form>

</body>
</html>