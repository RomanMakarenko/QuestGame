package romm.questgame.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import romm.questgame.repository.QuestionRepository;

import java.io.IOException;

@WebFilter(urlPatterns = "/game")
public class GameFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String selectedPath = request.getParameter("selectedPath");
        QuestionRepository questionRepository = new QuestionRepository();
        if (!questionRepository.isBranchExist(selectedPath)) {
            selectedPath = "0";
            String finalSelectedPath = selectedPath;
            request = new HttpServletRequestWrapper(request) {
                @Override
                public String getParameter(String name) {
                    if ("selectedPath".equals(name)) {
                        return finalSelectedPath;
                    }
                    return super.getParameter(name);
                }
            };
        }
        request.setAttribute("selectedPath", selectedPath);
        filterChain.doFilter(request, response);
    }
}
