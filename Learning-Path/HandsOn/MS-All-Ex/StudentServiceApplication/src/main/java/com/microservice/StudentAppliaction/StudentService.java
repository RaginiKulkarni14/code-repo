package com.microservice.StudentAppliaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private RestTemplate restTemplete;

	public Student saveStudent(Student student) 
	{
		return studentRepository.save(student);
	}

	/*public Student findByStudentId(int studentId)
	
		return studentRepository.findByStudentId(studentId);
	}*/


	public ResponseTemplateVO getStudentWithDepatment(int studentId) {
		ResponseTemplateVO vo=new ResponseTemplateVO();
		Student student=studentRepository.findByStudentId(studentId);
		Department department=restTemplete.getForObject("http://DEPARTMENT-SERVICE/department/"+student.getDepartmentId(), Department.class);
		vo.setDepartment(department);
		vo.setStudent(student);
		return vo;
	}
	
	

}
