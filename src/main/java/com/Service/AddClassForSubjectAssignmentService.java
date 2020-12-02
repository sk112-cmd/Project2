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
import com.Bean.AllSubjects;
import com.DAO.ClassSubjectAssignmentDAO;
import com.DAO.ClassesDAO;
import com.DAO.SubjectsDAO;

/**
 * Servlet implementation class AddClassForSubjectService
 */
@WebServlet("/AddClassForSubject")
public class AddClassForSubjectAssignmentService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Log log = LogFactory.getLog(AddClassForSubjectAssignmentService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassForSubjectAssignmentService() {
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
		String className,subjectName;
        log.info("entering into class subject assignment post method");
		className = request.getParameter("classToSelect");
		subjectName = request.getParameter("subjectToSelect");
		     
	    AllClassSubject classSubject = new AllClassSubject();
		
	    classSubject.setClassName(className);
	    classSubject.setSubjectName(subjectName);

		try {
			ClassSubjectAssignmentDAO dao = new ClassSubjectAssignmentDAO();

			int sID = dao.addsubjectsForClass(classSubject);

			if (sID > 0) {
				response.sendRedirect("teacherAddSuccessful.jsp");
			} else {
				response.sendRedirect("teacherAddFailure.jsp");
			}

		} catch (Exception e) {
          e.printStackTrace();
		}

	}

}
