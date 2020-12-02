package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Bean.AllClassSubjectTeacher;
import com.Bean.AllStudents;
import com.Util.DBUtil;

public class ClassSubjectTeacherAssignmentDAO {

private Log log = LogFactory.getLog(ClassesDAO.class);
	
	public synchronized int addTeacherSubjectAssignment(AllClassSubjectTeacher classSubjectTeacher) {
		log.info("Entering Method addStudents");
		int id = 0;
		Connection conn = DBUtil.getConnect();
		try {
			PreparedStatement ps = conn.prepareStatement(
					"insert into classmappingsubjectmappingteacher(className,subjectName,teacherName) values(?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			
			ps.setString(1, classSubjectTeacher.getClassName());
			ps.setString(2, classSubjectTeacher.getSubjectName());
			ps.setString(3, classSubjectTeacher.getTeacherName());

			int z = ps.executeUpdate();

			if (z > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				if (rs.next()) {
					id = rs.getInt(1);
				}
			}
			log.info("Exiting the method addTeachers");
			
			
			
			    return id;
	}catch(SQLException e) {
		e.printStackTrace();
	}
return id;
}

	public ArrayList<AllClassSubjectTeacher> getListOfTeachersWithClass(String className) {
		log.info("Entering Method getListOfTeachersWithClass ");
		ArrayList<AllClassSubjectTeacher> alist = new ArrayList<AllClassSubjectTeacher>();
		log.info(alist.toString());
		Connection conn = DBUtil.getConnect();
		PreparedStatement ps;
		try {
		ps = conn.prepareStatement("select * from classmappingsubjectmappingteacher where className=?");
		ps.setString(1,className);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			AllClassSubjectTeacher as = new AllClassSubjectTeacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		alist.add(as);
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return alist;
		}
	
	
	
	
}
