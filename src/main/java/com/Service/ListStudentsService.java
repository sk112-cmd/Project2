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
import com.DAO.StudentsDAO;

/**
 * Servlet implementation class GetAllStudentList
 */
@WebServlet("/StudentsListService")
public class ListStudentsService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Log log = LogFactory.getLog(ListStudentsService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudentsService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		StudentsDAO dao = new StudentsDAO();
		ArrayList<AllStudents> als=dao.listStudents();
		if(als.size()>0){
			log.info(als.toString());
			HttpSession session = request.getSession();
			session.setAttribute("listOfStudents", als);
			response.sendRedirect("studentList.jsp");
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
