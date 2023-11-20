<%@ page import="romm.questgame.repository.QuestionRepository" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="style.css" type="text/css"/>
    <script src=https://code.jquery.com/jquery-3.6.0.min.js></script>
    <script defer type="text/javascript" src="/solution.js"></script>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title>Jungle Quest</title>
</head>
<body class="gamebgimage" >
<div class="card">
    <h1>Jungle Quest</h1>
    <fieldset>
        <legend class="option-label"><%= request.getAttribute("questions") %> </legend>
        <%
            java.util.HashMap<Integer, String> hashMap = (HashMap<Integer, String>) request.getAttribute("options");
        %>
        <% for (java.util.Map.Entry<Integer, String> entry : hashMap.entrySet()) { %>
        <div class="option-rows">
            <input type="radio" name="drone" value=<%= entry.getKey() %> checked />
            <label><%= entry.getValue() %></label>
        </div>
        <% } %>
    </fieldset>
    <br>
    <input class="btn choose-btn" type="submit" value="ОБРАТИ">
</div>
</body>
</html>