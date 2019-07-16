package com.hbnu.mapper;

import java.util.Map;

import com.hbnu.entity.Student;

public interface StudentMapper {
	Student queryStudentBySno(int sno) ;
	void  deleteStuBySnoCallAble(Map<String,Object> params);
	Student studnetstucard(int sno);
	
	

}
