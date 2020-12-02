package com.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Bean.AllClassSubject;
import com.Bean.AllClassSubjectTeacher;
import com.DAO.ClassSubjectAssignmentDAO;
import com.DAO.ClassSubjectTeacherAssignmentDAO;

/**
 * Servlet implementation class AddClassSubjectTeacherAssignmentService
 */
@WebServlet("/AddClassFiveSubjectTeacher")
public class AddClassFiveSubjectTeacherService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Log log = LogFactory.getLog(AddClassFiveSubjectTeacherService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassFiveSubjectTeacherService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String className,teacherName,subjectName;
        log.info("entering into class subject teacher assignment post method");
		className = "V";
		subjectName = request.getParameter("subjectToSelect");
		teacherName = request.getParameter("teacherToSelect");
	    AllClassSubjectTeacher classSubjectTeacher = new AllClassSubjectTeacher();
		
	    classSubjectTeacher.setClassName(className);
	    classSubjectTeacher.setSubjectName(subjectName);
	    classSubjectTeacher.setTeacherName(teacherName);

		try {
			ClassSubjectTeacherAssignmentDAO dao = new ClassSubjectTeacherAssignmentDAO();

			int sID = dao.addTeacherSubjectAssignment(classSubjectTeacher);

			if (sID > 0) {
				response.sendRedirect("classSubjectAssignmentSuccessful.jsp");
			} else {
				response.sendRedirect("subjectAddFailure.jsp");
			}

		} catch (Exception e) {
          e.printStackTrace();
		}

	}

	
}
