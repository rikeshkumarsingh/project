package com.management.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.management.entity.EmpEntity;
import com.management.service.EmpService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpControl {
	@Autowired
	private EmpService service;
	@GetMapping("/")
	public String home(Model model) {
		
		List<EmpEntity> emp = service.getAllEmpEntities();
		model.addAttribute("emp",emp);
	
		
		return "index";
	}
	@GetMapping("/addemp")
	public String addemp() {
		return"add_emp";
	}
	@PostMapping("/register")
	public String EmpRegister(@ModelAttribute EmpEntity empEntity,HttpSession session ) {
		
		
		System.out.println(empEntity);
		service.addemp(empEntity);
		session.setAttribute("message", "Employ Added succesfully...");
		return "redirect:/";
		
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model model) {
		EmpEntity findEntity = service.getEmpById(id);
		model.addAttribute("emp",findEntity);
		return "edit";		
		
	}
	@PostMapping("/update")
	public String update(@ModelAttribute EmpEntity empEntity) {
		service.addemp(empEntity);
		return "redirect:/";		
		
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		service.deletemp(id);
		
		return "redirect:/";
	}
	

}
