package com.microservice.StudentAppliaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/")
	public Student saveStudent(@RequestBody Student department)
	{
		return studentService.saveStudent(department);
	}
	
	/*@GetMapping("/{studentId}")
	public Student findByStudentId(@PathVariable("studentId") int studentId)
	{
		return studentService.findByStudentId(studentId);
	}*/
	
	@GetMapping("/{studentId}")
	public ResponseTemplateVO getStudentWithDepatment(@PathVariable("studentId") int studentId)
	{
		return studentService.getStudentWithDepatment(studentId);
	}

}
