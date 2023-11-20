package romm.questgame.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import romm.questgame.repository.QuestionRepository;

import java.io.IOException;

@WebServlet(name = "game", value = "/game")
public class Game extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        QuestionRepository questionRepository = new QuestionRepository();
        request.setAttribute("questions", questionRepository.getQuestion(1).getQuestionText());
        request.setAttribute("options", questionRepository.getQuestion(1).getAnswerOptions());
        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
