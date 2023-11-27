package romm.questgame.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GameFilterTest {

    private GameFilter gameFilter;
    private HttpServletRequest request;
    private HttpServletResponse response;
    private FilterChain filterChain;

    @BeforeEach
    public void setUp() {
        gameFilter = new GameFilter();
        request = mock(HttpServletRequest.class);
        response = mock(HttpServletResponse.class);
        filterChain = mock(FilterChain.class);
    }

    @Test
    public void testDoFilterBranchExist() throws ServletException, IOException {
        when(request.getParameter("selectedPath")).thenReturn("1"); // Assuming path exists in the repository
        gameFilter.doFilter(request, response, filterChain);
        verify(request).setAttribute("selectedPath", "1");
        verify(filterChain).doFilter(any(ServletRequest.class), any(ServletResponse.class));
    }


    @Test
    public void testDoFilterBranchDoesNotExist() throws ServletException, IOException {
        when(request.getParameter("selectedPath")).thenReturn("nonexistent");
        FilterChain mockFilterChain = mock(FilterChain.class);
        gameFilter.doFilter(request, response, mockFilterChain);
        verify(request).setAttribute("selectedPath", "0");
        verify(mockFilterChain).doFilter(argThat(req -> req instanceof HttpServletRequest), argThat(res -> res instanceof HttpServletResponse));
    }
}
