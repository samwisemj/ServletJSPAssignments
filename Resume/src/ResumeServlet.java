
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.pojo.Person;

@WebServlet("/ResumeServlet")
public class ResumeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResumeServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Person p = new Person(request.getParameter("firstName"), request.getParameter("lastName"),
				request.getParameter("gender"), request.getParameter("qualification"), request.getParameter("dob"),
				request.getParameterValues("hobbies"), request.getParameterValues("skills"),
				request.getParameter("email"), request.getParameter("website"), request.getParameter("contact"),
				request.getParameter("bio"));
		System.out.println(p);
		request.setAttribute("PersonObject",p);
		 RequestDispatcher rd=request.getRequestDispatcher("ResumeShow.jsp");
		 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
