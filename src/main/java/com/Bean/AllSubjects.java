package com.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class AllSubjects {

	int subjectId;
	String subjectName;
    String subjectDescription;

	public AllSubjects() {

	}
	
	public int getSubjectId() {
		return subjectId;
	}



	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}



	public String getSubjectName() {
		return subjectName;
	}



	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}



	public String getSubjectDescription() {
		return subjectDescription;
	}



	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}

	public AllSubjects(String subjectName, String subjectDescription) {
		this.subjectName = subjectName;
		this.subjectDescription = subjectDescription;
	}


	public AllSubjects(int subjectId, String subjectName, String subjectDescription) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.subjectDescription = subjectDescription;
	}

	
	@Override
	public String toString() {
		return "AllSubjects [subjectId=" + subjectId + ", subjectName=" + subjectName + ", subjectDescription="
				+ subjectDescription + "]";
	}

	
}
