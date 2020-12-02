package com.Service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Bean.AllClassSubjectTeacher;
import com.Bean.AllStudents;
import com.DAO.ClassSubjectAssignmentDAO;
import com.DAO.ClassSubjectTeacherAssignmentDAO;
import com.DAO.ClassesDAO;
import com.DAO.StudentsDAO;

/**
 * Servlet implementation class NavigateClassFiveReport
 */
@WebServlet("/ReportForClassFive")
public class NavigateClassFiveReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Log log = LogFactory.getLog(NavigateClassFiveReport.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavigateClassFiveReport() {
        super();
        // TODO Auto-generated constructor stub
    }

    HttpServlet request1;
	HttpServlet response1;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//listOfClassFiveStudents(request, response);
		//response.sendRedirect("reportForClassFive.jsp");
        listOfTeachersInClassFive(request, response);
        response.sendRedirect("reportForClassFive.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	
	private void listOfClassFiveStudents(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentsDAO dao = new StudentsDAO();
		ArrayList<AllStudents> als=dao.getStudentforClassFive();
		if(als.size()>0){
			log.info(als.toString());
			HttpSession session = request.getSession();
			session.setAttribute("listOfStudents", als);
			
	   }
	}
	
	private void listOfTeachersInClassFive(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String className="V";
		ClassSubjectTeacherAssignmentDAO tdao = new ClassSubjectTeacherAssignmentDAO();
		ArrayList<AllClassSubjectTeacher> als =tdao.getListOfTeachersWithClass(className);
		if(als.size()>0){
			log.info(als.toString());
			HttpSession session = request.getSession();
			session.setAttribute("listOfTeachersWithClass", als);
			//((HttpServletResponse) response).sendRedirect("reportForClassFive.jsp");
	   }
		
	}
	
	
}


