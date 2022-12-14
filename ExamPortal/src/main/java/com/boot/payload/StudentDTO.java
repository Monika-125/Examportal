package com.boot.payload;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.boot.entity.CourseEntity;
import com.boot.entity.EnrolledCourseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@ToString
	public class StudentDTO {

	     private int studentId;
	     
	     private String studentName;
	     
	     private String studentQualification;
	     
	     private int studentAge;
	     
	     private String studentEmail;
	     
	     private String studentPassword;
	     
         private String studentMobileNumber;	     
	     
         @JsonIgnore
         private List<EnrolledCourseEntity> studentList=new ArrayList<>();

 
}


