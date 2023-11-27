<%@ page import="romm.questgame.entity.Question" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    Question question = (Question) request.getAttribute("question");
    Integer visitCount = (Integer) session.getAttribute("visitCount");
    if (visitCount == null) {
        visitCount = 1;
    } else if (question.getQuestionLevel() == 1) {
        visitCount++;
    }
    session.setAttribute("visitCount", visitCount);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="style.css" type="text/css"/>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <title>Jungle Quest</title>
</head>
<body class="gamebgimage">

<div class="card">
    <h1>Jungle Quest</h1>
    <form method="get">
        <fieldset>
            <legend class="option-label"><%= question.getQuestionText() %></legend>
            <% for (java.util.Map.Entry<String, String> entry : question.getAnswerOptions().entrySet()) { %>
                <div class="option-rows">
                    <input type="radio" name="selectedPath" value=<%= entry.getKey() %> checked/>
                    <label><%= entry.getValue() %></label>
                </div>
            <% } %>
        </fieldset>
        <br>
        <button class="btn choose-btn" id="submitBtn">ОБРАТИ</button>
        <p>Ваша спроба пройти квест = <%= session.getAttribute("visitCount")%></p>
    </form>
</div>
</body>
</html>
