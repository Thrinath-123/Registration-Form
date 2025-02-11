package com.thrinath.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.thrinath.model.UserForm;

@Controller
public class FormController {
	
	// Handler method to handle user registration page request
	
	@GetMapping("register")
	public String userRegistrationPage(Model model){
		
		// Empty userForm model object to store form data 
		
		UserForm userForm =new UserForm();
		
		model.addAttribute("userForm", userForm);
		
		List<String> listprofession=Arrays.asList("Developer","Tester","Architect");
		
		model.addAttribute("listprofession", listprofession);
		
		return "register-form";
		
	}

	// Handler method to handle user registration form submission request
	@PostMapping("register/save")
	public String submitForm(Model model,
			                  @ModelAttribute("userForm") UserForm userForm) {
		
		model.addAttribute("userForm", userForm);
		
		
		return "register-success" ;
		
		
	}
}
