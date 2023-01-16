<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Dog</title>
</head>
<style>
body {
  background-image: url(doguin.jpg);
  background-size: 1920px 1920px;
  background-repeat: no-repeat;
  background-position: center, bot;
  background-position: 
  
  
}
</style>

<body>

<form action="/dog-engenous/entrada" method="post">
Nome do Doguinho: <input type="text" name="nome" value="${dog.nome }"/>
</br></br></br>
Raça do Doguinho: <input type="text" name="raca" value="${dog.raca }"/>
</br></br></br>
Idade do Doguinho: <input type="text" name="idade" value="${dog.idade }"/>
</br></br></br>
<input type="hidden" value="${dog.id }" name="id"/>
<input type="hidden" value="AlteraDog" name="acao"/>
<input type="submit" value="Alterar"/>


</form>



</body>
</html>