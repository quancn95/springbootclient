package com.fre18.qnt.client;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fre18.qnt.model.Student;

@Component
public class CallRestService implements CommandLineRunner{

	private static void callService(){
		RestTemplate restTemplate = new RestTemplate();
		Student student = restTemplate.getForObject("http://localhost:8080/student", Student.class);
		System.out.println("Student name: " +student.getStudentName());
		
		Student[] list = restTemplate.getForObject("http://localhost:8080/students", Student[].class);
		if(list!=null){
			for (Student item : list) {
				System.out.println("Student: "+item.getStudentId()+" Name: " +item.getStudentName());
			}
		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		callService();
	}
}
