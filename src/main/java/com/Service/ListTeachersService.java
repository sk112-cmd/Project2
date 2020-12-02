package com.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Bean.AllStudents;
import com.Bean.AllSubjects;
import com.Bean.AllTeachers;
import com.DAO.StudentsDAO;
import com.DAO.SubjectsDAO;
import com.DAO.TeachersDAO;

/**
 * Servlet implementation class ListTeachersService
 */
@WebServlet("/TeachersListService")
public class ListTeachersService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Log log = LogFactory.getLog(ListSubjectsService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTeachersService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TeachersDAO td = new TeachersDAO();
		List<AllTeachers>  getAllTeachers = td.listTeachers();
		if(getAllTeachers.size()>0){
			log.info(getAllTeachers.toString());
			HttpSession session = request.getSession();
			session.setAttribute("listOfTeachers", getAllTeachers);
			response.sendRedirect("teacherList.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
