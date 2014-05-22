package jp.co.jjs.java_seminar;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Omikuji
 */
@WebServlet("/Omikuji")
public class Omikuji extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Omikuji() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	    response.setContentType("text/html;charset=UTF-8");

	    String[] result = {"大吉", "中吉", "吉", "凶"};
	    String[] message = {"イイネ！", "Soso.", "普通以下", "残念！"};

	    int kuji = (int)Math.floor(Math.random()*4);
	    request.setAttribute("result", result[kuji]);
	    request.setAttribute("message", message[kuji]);

	    RequestDispatcher dispatchar = request.getRequestDispatcher("result.jsp");
        dispatchar.forward(request, response);
	}

}
