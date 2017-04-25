package com.implement;

import java.util.List;

import javax.annotation.Resource;

import pojo.Student;
import pojo.StudentInfoMapper;



public class StudentImplement implements StudentInfoMapper{
	@Resource
	private StudentInfoMapper studentInfoMapper;
	
	public void insertStudent(Student userinfo) {
		// TODO Auto-generated method stub
		
	}
	public void updateStudent(Student userinfo) {
		// TODO Auto-generated method stub
		
	}
	public List<Student> getStudentList() {
		// TODO Auto-generated method stub
		return null;
	}
	public void deleteStudent(String name) {
		// TODO Auto-generated method stub
		
	}
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}
	public int getStudentCount() {
		// TODO Auto-generated method stub
		return studentInfoMapper.getStudentCount();
	}
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
