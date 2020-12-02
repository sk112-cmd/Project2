package com.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.AllStudents;
import com.Bean.AllSubjects;
import com.DAO.StudentsDAO;
import com.DAO.SubjectsDAO;

/**
 * Servlet implementation class AddSubjectsService
 */
@WebServlet("/AddSubjectsService")
public class AddSubjectsService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddSubjectsService() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String subjectName,subjectDescription;

		subjectName = request.getParameter("subjectName");
		subjectDescription = request.getParameter("subjectDescription");
		     
	    AllSubjects subjects = new AllSubjects();
		
	    subjects.setSubjectName(subjectName);
	    subjects.setSubjectDescription(subjectDescription);

		try {
			SubjectsDAO dao = new SubjectsDAO();

			int sID = dao.addSubjects(subjects);

			if (sID > 0) {
				response.sendRedirect("subjectAddSuccessful.jsp");
			} else {
				response.sendRedirect("subjectAddFailure.jsp");
			}

		} catch (Exception e) {
          e.printStackTrace();
		}

	}

}
