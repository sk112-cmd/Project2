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

import com.Bean.AllStudents;
import com.Bean.AllSubjects;
import com.Bean.AllTeachers;
import com.Util.DBUtil;

public class TeachersDAO {
	private Log log = LogFactory.getLog(TeachersDAO.class);

	public ArrayList<AllTeachers> listTeachers() {
		log.info("Entering Method listTeachers ");
		ArrayList<AllTeachers> alist = new ArrayList<AllTeachers>();
		log.info(alist.toString());
		Connection conn = DBUtil.getConnect();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("select * from teachers");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				AllTeachers as = new AllTeachers(rs.getInt(1),rs.getString(2), rs.getString(3));
				alist.add(as);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("Exiting the method listTeachers");
		return alist;
	}

	public synchronized int addTeachers(AllTeachers teacher) {
		log.info("Entering Method addTeachers");
		int id = 0;
		Connection conn = DBUtil.getConnect();
		try {
			PreparedStatement ps = conn.prepareStatement(
					"insert into teachers(teacherName,teacherQualification) values(?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, teacher.getTeacherName());
			ps.setString(2, teacher.getTeacherQualification());

			int z = ps.executeUpdate();

			if (z > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					id = rs.getInt(1);
				}
			}
			log.info("Exiting the method addTeachers");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}

}
