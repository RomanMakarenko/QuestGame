package romm.questgame.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import romm.questgame.entity.Question;
import romm.questgame.repository.QuestionRepository;

import java.io.IOException;
import java.util.HashMap;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {

    @Mock
    private HttpServletRequest mockRequest;

    @Mock
    private HttpServletResponse mockResponse;

    @Mock
    private RequestDispatcher mockRequestDispatcher;

    @Mock
    private QuestionRepository mockQuestionRepository;

    @InjectMocks
    private Game gameServlet;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoGet() throws ServletException, IOException {
        String selectedPath = "0";
        Question mockQuestion = new Question("Виявилось що ви були в зоні ядерних випробувань. Ядерний удар не залишив вам шансів.", 1, new HashMap<>() {{
            put("1", "Почати заново");
            put("2", "Закінчити");
        }});
        when(mockRequest.getParameter("selectedPath")).thenReturn(selectedPath);
        when(mockQuestionRepository.getQuestion(selectedPath)).thenReturn(mockQuestion);
        when(mockRequest.getRequestDispatcher("/game.jsp")).thenReturn(mockRequestDispatcher);
        gameServlet.doGet(mockRequest, mockResponse);
        verify(mockRequest).setAttribute("question", mockQuestion);
        verify(mockRequestDispatcher).forward(mockRequest, mockResponse);
    }
}
