package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Bean.AllClasses;
import com.Bean.AllStudents;
import com.Bean.AllSubjects;
import com.Bean.AllTeachers;
import com.Util.DBUtil;

public class SubjectsDAO {
	private Log log = LogFactory.getLog(SubjectsDAO.class);

	public ArrayList<AllSubjects> listSubjects() {
		log.info("Entering Method listSubjects ");
		ArrayList<AllSubjects> alist = new ArrayList<AllSubjects>();
		log.info(alist.toString());
		Connection conn = DBUtil.getConnect();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from subjects");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AllSubjects as = new AllSubjects(rs.getInt(1),rs.getString(2), rs.getString(3));
				alist.add(as);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Exiting the method listSubjects");
		return alist;
	}

	public synchronized int addSubjects(AllSubjects subjects) {
		log.info("Entering Method addSubjects");
		int id = 0;
		Connection conn = DBUtil.getConnect();
		try {
			log.info("before query");
			PreparedStatement ps = conn.prepareStatement(
					"insert into subjects(subjectName,subjectDescription) values(?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, subjects.getSubjectName());
			ps.setString(2, subjects.getSubjectDescription());
			
            log.info(ps.toString());
			int z = ps.executeUpdate();

			if (z > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					id = rs.getInt(1);
				}
			}
			log.info("Exiting the method addSubjects");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	
	
	

	}
