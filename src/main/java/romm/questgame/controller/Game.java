package romm.questgame.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import romm.questgame.entity.Question;
import romm.questgame.repository.QuestionRepository;

import java.io.IOException;

@WebServlet(name = "game", value = "/game")
public class Game extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        QuestionRepository questionRepository = new QuestionRepository();
        String selectedPath = request.getParameter("selectedPath");
        Question question = questionRepository.getQuestion(selectedPath);
        request.setAttribute("question", question);
        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }
}
