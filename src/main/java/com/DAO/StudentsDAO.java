package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Bean.AllClassSubject;
import com.Bean.AllStudents;
import com.Util.DBUtil;
import com.mysql.cj.protocol.Resultset;

public class StudentsDAO {

	private Log log = LogFactory.getLog(StudentsDAO.class);

	/*
	 * public synchronized List<AllStudents> listStudents() {
	 * log.info("Entering Method listStudents "); Session session =
	 * this.userDetailsSessionFactory(); List<AllStudents> studentsList = new
	 * ArrayList<AllStudents>(); try { studentsList =
	 * session.createQuery(" from AllStudents").getResultList();
	 * log.info(studentsList.toString()); } catch (Exception re) {
	 * log.error(" Error while executing the method listStudents " + re.getMessage()
	 * + re.getClass()); throw re; } finally { if (session != null) { try {
	 * session.close(); } catch (Exception e) { log.error("Session Closed!" + e); }
	 * } log.info("Exiting the method listStudents");
	 * 
	 * } return studentsList; }
	 */
	
	public ArrayList<AllStudents> listStudents() {
		log.info("Entering Method listStudents ");
		ArrayList<AllStudents> alist = new ArrayList<AllStudents>();
		log.info(alist.toString());
		Connection conn = DBUtil.getConnect();
		PreparedStatement ps;
		try {
		ps = conn.prepareStatement("select * from studentmaster");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		AllStudents as = new AllStudents(rs.getString(2),rs.getString(3),rs.getString(4));
		alist.add(as);
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return alist;
		}
	
	
	
	public synchronized int addStudents(AllStudents students) {
		log.info("Entering Method addStudents");
		int id = 0;
		Connection conn = DBUtil.getConnect();
		try {
			PreparedStatement ps = conn.prepareStatement(
					"insert into studentmaster(studentName,studentClass,subjectCode) values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, students.getStudentName());
			ps.setString(2, students.getStudentClass());
			ps.setString(3, students.getSubjectCode());

			int z = ps.executeUpdate();

			if (z > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					id = rs.getInt(1);
				}
			}
			log.info("Exiting the method addstudents");

		} catch (Exception e) {
			e.printStackTrace();
		}
    return id;
	}
	
	
	public synchronized ArrayList<AllStudents> getStudentforClassFive(){
		String className="V";
		log.info("Entering into getStudentforClassFive method");
		ArrayList<AllStudents> allStudents = new ArrayList<AllStudents>();
		Connection conn=DBUtil.getConnect();
		PreparedStatement ps;
		try {
		ps = conn.prepareStatement("select * from studentmaster where studentClass=?");
		ps.setString(1,className);
		ResultSet rs=ps.executeQuery();
		log.info(rs.toString());
		while(rs.next())
		{
			AllStudents as =new AllStudents(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			allStudents.add(as);
		log.info(as.toString());
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return allStudents;
		}
		
	
	
	
}
