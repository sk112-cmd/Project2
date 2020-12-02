package com.Bean;

public class AllClassSubjectTeacher {
	
	int serialNo;
	String className;
	String subjectName;
	String teacherName;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	
	public AllClassSubjectTeacher() {
		
	}
	
	public AllClassSubjectTeacher(int serialNo, String className, String subjectName, String teacherName) {
		super();
		this.serialNo = serialNo;
		this.className = className;
		this.subjectName = subjectName;
		this.teacherName = teacherName;
	}
	public AllClassSubjectTeacher(String className, String subjectName, String teacherName) {
		super();
		this.className = className;
		this.subjectName = subjectName;
		this.teacherName = teacherName;
	}
	@Override
	public String toString() {
		return "AllClassSubjectTeacher [serialNo=" + serialNo + ", className=" + className + ", subjectName="
				+ subjectName + ", teacherName=" + teacherName + "]";
	}

	
	
	
}
