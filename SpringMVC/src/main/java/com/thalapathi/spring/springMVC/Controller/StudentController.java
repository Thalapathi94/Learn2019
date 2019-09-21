package com.thalapathi.spring.springMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thalapathi.spring.springMVC.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/Registration")
	public ModelAndView showMessage() {

		ModelAndView mv = new ModelAndView("student_registration");
		mv.addObject("student", new Student());
		return mv;
	}

	
	@RequestMapping("/processForm")
	public ModelAndView getInputs(@ModelAttribute("student") Student student) {
		System.out.println("FirstName---:"+student.getFirstName());
		System.out.println("LastName---:"+student.getLastName());
		System.out.println("Sexx---:"+student.getSex());
		System.out.println("Email---:"+student.getEmail());
		System.out.println("Password---:"+student.getPassword());
		ModelAndView mv = new ModelAndView("registered");
		String message = "Hi "+student.getFirstName()+". You have registered successfully.";
		mv.addObject("message", message);
		return mv;
	}
}
