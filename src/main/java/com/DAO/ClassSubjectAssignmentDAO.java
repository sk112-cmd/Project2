package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.Bean.AllClassSubject;
import com.Bean.AllClassSubjectTeacher;
import com.Bean.AllSubjects;
import com.Util.DBUtil;

public class ClassSubjectAssignmentDAO {

	private Log log = LogFactory.getLog(StudentsDAO.class);
	
	public synchronized int addsubjectsForClass(AllClassSubject subjectForClass) {
		log.info("Entering Method addsubjectsForClass");
		int id = 0;
		Connection conn = DBUtil.getConnect();
		try {
			log.info("before query");
			PreparedStatement ps = conn.prepareStatement(
					"insert into classmappingsubject(className,subjectName) values(?,?)",
					Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, subjectForClass.getClassName());
			ps.setString(2, subjectForClass.getSubjectName());
			
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

	public synchronized ArrayList<AllClassSubject> getSelectiveSubjects(String className){
		log.info("Entering into getSelectiveSubjects method");
		ArrayList<AllClassSubject> allClassesSubject = new ArrayList<AllClassSubject>();
		Connection conn=DBUtil.getConnect();
		log.info("Executing getSelectiveSubjects query");
		PreparedStatement ps;
		try {
		ps = conn.prepareStatement("select * from classmappingsubject where className=?");
		ps.setString(1,className);
		ResultSet rs=ps.executeQuery();
		log.info(rs.toString());
		while(rs.next())
		{
			AllClassSubject acs =new AllClassSubject(rs.getInt(1),rs.getString(2),rs.getString(3));
			allClassesSubject.add(acs);
		log.info(acs.toString());
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return allClassesSubject;
		}

}
