<%@ page import="java.util.HashMap" %>
<%@ page import="romm.questgame.entity.Question" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    java.util.HashMap<Integer, Question> hashMap = (HashMap<Integer, Question>) request.getAttribute("questions");
    Integer questionNumber = Integer.parseInt(request.getParameter("selectedPath"));
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="style.css" type="text/css"/>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script defer type="text/javascript" src="/solution.js"></script>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title>Jungle Quest</title>
</head>
<body class="gamebgimage">

<div class="card">
    <h1>Jungle Quest</h1>
    <% if (true) { %>
    <form method="get">
        <fieldset>
            <legend class="option-label"><%= hashMap.get(questionNumber).getQuestionText() %></legend>
            <% for (java.util.Map.Entry<Integer, String> entry : hashMap.get(questionNumber).getAnswerOptions().entrySet()) { %>
            <div class="option-rows">
                <input type="radio" name="selectedPath" value=<%= entry.getKey() %> checked/>
                <label><%= entry.getValue() %></label>
            </div>
            <% } %>
        </fieldset>
        <br>
        <button class="btn choose-btn" id="submitBtn">ОБРАТИ</button>
    </form>
    <% } %>
</div>
</body>
</html>
