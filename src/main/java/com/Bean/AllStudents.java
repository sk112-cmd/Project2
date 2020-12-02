package com.Bean;


public class AllStudents {
	
	int studentId;
	String studentName;
	String studentClass;
	String subjectCode;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}



	public AllStudents(String studentName, String studentClass, String subjectCode) {
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.subjectCode = subjectCode;
	}

	public AllStudents(int studentId,String studentName, String studentClass, String subjectCode) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.subjectCode = subjectCode;
	}


	public AllStudents() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AllStudents [studentId=" + studentId + ", studentName=" + studentName + ", studentClass=" + studentClass
				+ ", subjectCode=" + subjectCode + "]";
	}
	

}
