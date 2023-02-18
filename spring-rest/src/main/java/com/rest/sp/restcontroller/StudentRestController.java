package com.rest.sp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.sp.model.Message;
import com.rest.sp.model.Student;
import com.rest.sp.service.IStudentService;

@RestController
@RequestMapping("rest/student")
public class StudentRestController {
	
	
	@Autowired
	private IStudentService iStudentService;
	
						@PostMapping("/save")
						public	ResponseEntity<Message>	 saveStudent(@RequestBody Student student) {
								ResponseEntity<Message> resp=null;
								try {
								Integer id=iStudentService.saveStudent(student);
								resp=new ResponseEntity<Message>(new Message ("Success",id+"-saved"),HttpStatus.OK);
								}catch (Exception e) {
									resp=new ResponseEntity<Message>(new Message ("FAIL","Unable to save"),HttpStatus.OK);
									e.printStackTrace();
								}
								return resp;
								
							}
	
	

}
