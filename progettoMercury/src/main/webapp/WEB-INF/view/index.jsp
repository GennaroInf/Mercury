<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html><head>
<title>Mercury</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Comune di Pomarrano Terme</h1>
<table border=0>
<tr>
<td>
<select name="mydropdown">
<option value="regione">Regione</option>
<option value="provincia">Provincia</option>
<option value="comune">Comune</option>
</select>
</td>

<td>
<form action="">
<input type="text" name="val">
</form>
</td>
</tr>

<tr>
<td>
<h4>Seleziona il tipo di evento:</h4>
<td>
</tr>

<tr>
<td>
<input type="checkbox" name="film"> Film<br>
<input type="checkbox"  name="concerto"> Concerto <br>
<input type="checkbox"  name="teatro" > Teatro <br>
<input type="checkbox"  name="mostra" > Mostra <br>
<input type="checkbox"  name="sagra" > Sagra <br>	
</td>
</tr>

<tr>
<td>
<input type="checkbox" name="giorno"> Eventi Quotidiani<br>
</td>
</tr>

<tr>

<td>
<label for="start">Evento dal giorno: </label>
</td>

<td>
<input type="date" id="start" name="datainizio" min="2018-05-01" max="2018-12-31">
</td>

<td>
<label for="start">al giorno: </label>
</td>

<td>
<input type="date" id="start" name="datafine" min="2018-05-01" max="2018-12-31">
</td>

</tr>

</table>
</body>
</html>