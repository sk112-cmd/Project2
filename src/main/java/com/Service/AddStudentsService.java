package com.Service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.AllClasses;
import com.Bean.AllStudents;
import com.DAO.ClassesDAO;
import com.DAO.StudentsDAO;

/**
 * Servlet implementation class AddStudentsService
 */

@WebServlet("/AddStudentsService")
public class AddStudentsService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudentsService() {
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String studentName, studentClass, subjectCode;

		studentName = request.getParameter("studentName");
		studentClass = request.getParameter("studentClass");
		subjectCode = null;
		if (studentClass.equals("V")) {
			subjectCode = "LA_FIVE";
			// break;
		} else if (studentClass.equals("VI")) {
			subjectCode = "LA_SIX";
		} else if (studentClass.equals("VII")) {
			subjectCode = "LA_SEVEN";
		} else if (studentClass.equals("VIII")) {
			subjectCode = "LA_EIGHT";
		} else if (studentClass.equals("IX")) {
			subjectCode = "LA_NINE";
		} else if (studentClass.equals("X")) {
			subjectCode = "LA_TEN";
		}

		AllStudents students = new AllStudents();

		students.setStudentName(studentName);
		students.setStudentClass(studentClass);
		students.setSubjectCode(subjectCode);

		try {
			StudentsDAO dao = new StudentsDAO();

			int sID = dao.addStudents(students);

			if (sID > 0) {
				response.sendRedirect("studentAddSuccessful.jsp");
			} else {
				response.sendRedirect("studentAddFailure.jsp");
			}

		} catch (Exception e) {
          e.printStackTrace();
		}
	}

}
