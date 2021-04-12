<%-- 
    Document   : disciplina
    Created on : 11 de abr. de 2021, 21:29:19
    Author     : Isado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="Classe.Disciplina"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disciplinas</title>
    </head>
    
    <% if (request.getParameter("Salvar")!=null){
    int p1 = Integer.parseInt(request.getParameter("P1"));
    Disciplina disciplina2= Disciplina.getDisciplina();
    disciplina.setp1(p1);
        }%>
        
       <% if (request.getParameter("Salvar")!=null){
    int p2 = Integer.parseInt(request.getParameter("P2"));
    Disciplina disciplina2= Disciplina.getDisciplina();
    disciplina.setp2(p2);
        }%>
        
        
        <body>
           <%@include file="WEB-INF/jspf/header.jspf"%> 
        <h1>Minhas Disciplinas</h1>
        
        <hr/>
        <table border="3">
            </hr>
            <tr>
                <th>Nome</th>
                <th>Ementa</th>
                <th>Ciclo</th>
                <th>P1</th>
                <th>P2</th>
                <th>Alterar</th>
            </tr>
            <tr> 
                
                <%for(int i = 0; i<Disciplin.getDisciplina().size();i++){
                Disciplina disciplina2= (Disciplina)Disciplina.getDisciplina().get(i);
                    }
                    %>
                   
                    <td>
                        <form  method="get">
                            <input type="text" name="p1" value="0"/> 
                            <input type="text" name="p2" value="0"/> 
                            <input type="submit"  value="Salvar"/> 
                            <input type="hedden"  value="Salvar" value="1"/> 
                        </form>
                       </td>
        </table>
                    
    </body>
</html>
