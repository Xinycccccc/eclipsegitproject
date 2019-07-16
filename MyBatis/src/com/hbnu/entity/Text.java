package com.hbnu.entity;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hbnu.mapper.StudentMapper;

public class Text {

	public static void selectstudnetBySno() throws IOException {
		Reader reader =  Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session =sessionFactory.openSession();
//		String statement = "com.hbnu.entity.StudentMapper."+"queryStudentBySno";
//		Student student = session.selectOne(statement,21);
		 StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		Student student = studentMapper.queryStudentBySno(21);

		System.out.println(student);
		session.close();
	
		
		
		
		
		
	}
	public static void deleteStuBySnocallable() throws IOException {
		Reader reader =  Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session =sessionFactory.openSession();
//		String statement = "com.hbnu.entity.StudentMapper."+"queryStudentBySno";
//		Student student = session.selectOne(statement,21);
		 StudentMapper studentMapper = session.getMapper(StudentMapper.class);
		 Map<String,Object> snomap = new HashMap<>();
		 snomap.put("stuno",100 );
		 studentMapper.deleteStuBySnoCallAble(snomap);
		 session.commit();


		session.close();
	}
	public static void studentstucard001() throws IOException {
		Reader reader =  Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session =sessionFactory.openSession();
//		String statement = "com.hbnu.entity.StudentMapper."+"queryStudentBySno";
//		Student student = session.selectOne(statement,21);
		 StudentMapper studentMapper = session.getMapper(StudentMapper.class);
//		 Map<String,Object> snomap = new HashMap<>();
//		 snomap.put("stuno",100 );
		 Student student = studentMapper.studnetstucard(1);
		 session.commit();
		 System.out.println(student);


		session.close();
	
	}

	public static void selectallstudnet() throws IOException {
		Reader reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sessionFactory.openSession();
		String statement = "com.hbnu.entity.StudentMapper." + "queryAllStudent";
		List<Student> students = session.selectList(statement);
		System.out.println(students.size());
		System.out.println(students);
		session.close();

	}
	public static void addstudnet() throws IOException {
		Reader reader =  Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session =sessionFactory.openSession();
		String statement = "com.hbnu.entity.StudentMapper."+"addstudent"; 
		Student student  = new Student(5466,"tfd",24,"ers"); 
		int count = session.insert(statement,student);
		session.commit();
		System.out.println(count);
		session.close();
				
	}
	public static void deletestudnet() throws IOException {
		Reader reader =  Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session =sessionFactory.openSession();
		String statement = "com.hbnu.entity.StudentMapper."+"deleteStudentBySno";  
		int count = session.insert(statement,19);
		session.commit();
		System.out.println(count);
		session.close();
				
	}
	public static void updatestudnet() throws IOException {
		Reader reader =  Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session =sessionFactory.openSession();
		String statement = "com.hbnu.entity.StudentMapper."+"updateStudent";  
		Student student = new Student();
		student.setSno(100);
		student.setSname("jj");
		student.setSaddress("asdfajkhf");
		student.setSage(100);
		int count = session.insert(statement,student);
		session.commit();
		System.out.println(count);
		session.close();
				
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		selectstudnetBySno();
//		selectallstudnet();m
//		updatestudnet();
//		selectallstudnet();
//		deleteStuBySnocallable();
		studentstucard001();
//		
		
		

		

	}

}
