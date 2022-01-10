package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		String str = request.getParameter("forward");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(str.equals("main")) {
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title>servlet</title>");
			out.println("</head><body>");
			out.println("<a href='search?forward=next'>다음 페이지</a>");
			out.println("</body></html>");
		}else if(str.equals("next")) {
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title>servlet</title>");
			out.println("</head><body>");
			out.println("다음 페이지입니다.");
			out.println("</body></html>");
		}
	}
}
