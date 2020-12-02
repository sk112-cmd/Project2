package com.Bean;

public class AllClassSubject {

	int serialNo;
	String className;
	String subjectName;
	
	public AllClassSubject() {
		
	}

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

	public AllClassSubject(int serialNo, String className, String subjectName) {
		super();
		this.serialNo = serialNo;
		this.className = className;
		this.subjectName = subjectName;
	}

	public AllClassSubject(String className, String subjectName) {
		super();
		this.className = className;
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "AllClassSubject [serialNo=" + serialNo + ", className=" + className + ", subjectName=" + subjectName
				+ "]";
	}
	
	
}
