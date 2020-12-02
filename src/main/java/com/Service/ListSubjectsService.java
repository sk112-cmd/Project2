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


import com.Bean.AllSubjects;
import com.DAO.SubjectsDAO;

/**
 * Servlet implementation class ListSubjectsService
 */
@WebServlet("/SubjectsListService")
public class ListSubjectsService extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Log log = LogFactory.getLog(ListSubjectsService.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSubjectsService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SubjectsDAO sbd = new SubjectsDAO();
		ArrayList<AllSubjects>  getAllSubjects = sbd.listSubjects();
		log.info(getAllSubjects.toString());
		if(getAllSubjects.size()>0){
			log.info(getAllSubjects.toString());
			HttpSession session = request.getSession();
			session.setAttribute("listOfSubjects", getAllSubjects);
			response.sendRedirect("subjectList.jsp");
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
