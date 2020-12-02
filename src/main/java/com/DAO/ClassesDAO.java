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
import com.Util.DBUtil;

public class ClassesDAO {
	private Log log = LogFactory.getLog(ClassesDAO.class);
	
	public ArrayList<AllClasses> listClasses() {
		log.info("Entering Method listClasses ");
		ArrayList<AllClasses> alist = new ArrayList<AllClasses>();
		log.info(alist.toString());
		Connection conn = DBUtil.getConnect();
		PreparedStatement ps;
		try {
		ps = conn.prepareStatement("select * from classes");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
		AllClasses as = new AllClasses(rs.getString(2),rs.getString(3));
		alist.add(as);
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return alist;
		}

}
