package cho.yechan.java;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/timestamp.html")
public class TimestampServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String now = new SimpleDateFormat("yyyy-MM-DD'T'HH:mm:ss").format(new Date());
		request.setAttribute("now", now);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/template/timestamp.jsp");
		dispatcher.forward(request, response);
	}
	
}
