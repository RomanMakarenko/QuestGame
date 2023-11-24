package romm.questgame.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.w3c.dom.ls.LSOutput;
import romm.questgame.repository.QuestionRepository;

import java.io.IOException;

@WebServlet(name = "game", value = "/game")
public class Game extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        QuestionRepository questionRepository = new QuestionRepository();
        request.setAttribute("questions", questionRepository.getQuestions());
        request.getRequestDispatcher("/game.jsp").forward(request, response);
    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String selectedOption = request.getParameter("selectedPath");
//        System.out.println("Обраний варіант: " + selectedOption);
//        response.setContentType("text/html");
//    }

    public void destroy() {
    }
}
