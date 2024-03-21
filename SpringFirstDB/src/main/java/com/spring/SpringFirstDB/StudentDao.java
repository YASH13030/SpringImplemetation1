package com.spring.SpringFirstDB;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public interface StudentDao extends JpaRepository<Student, Long> {

	
	public static List<Student> showdata(){
		
		return null;
	}
}
