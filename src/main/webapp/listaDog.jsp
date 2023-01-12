<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista</title>
</head>
<body>

<style>
body {
  background-image: url(dog.jpg);
  background-size: 1920px 1920px;
  background-repeat: no-repeat;
  background-position: center, bot;
  background-position: 
  
  
}
</style>

Lista de Dogs Cadastrados:
</br></br></br>
<c:forEach items="${listaDog }" var="lista">
<ul>
Nome: ${lista.nome }
Raça: ${lista.raca }
Idade: ${lista.idade }aninhos!
ID: ${lista.id } 
<a href="/dog-engenous/mostraCao?id=${lista.id }">Modificar</a> 
<a href="/dog-engenous/removeDog?id=${lista.id }">Remover</a>
  

</ul>
</br>

</c:forEach>


</body>
</html>