<%-- 
    Document   : connect-content
    Created on : 26 mai 2017, 20:05:34
    Author     : deptinfo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        
         <form method="POST" action="ServletEtudiant?action=creerEtudiant">
                    Nom : <input type="text" name="nom"/><br>  
                    Prénom : <input type="text"  name="prenom"/><br> 
                    Email : <input type="text"  name="email"/><br> 
                    Password : <input type="password"  name="pass"/><br> 
                    Confirme Password : <input type="password"  name="confirmepass"/><br> 
                    <input type="hidden" name="action" value="creerEtudiant"/>  
                    <input type="submit" value="creer" name="submit"/>  
                </form>  
    </body>
</html>
