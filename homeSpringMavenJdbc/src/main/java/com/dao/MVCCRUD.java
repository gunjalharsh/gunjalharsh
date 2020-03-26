package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homeBeanClasses.homeEmployee;

@Controller
public class MVCCRUD {
	@Autowired
	EmpJDBCController dao2;
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public String save(homeEmployee emp) {
		
		dao2.save1(emp);
		return "redirect:/viewemps";
	}

	@RequestMapping("/viewemps")
	public String viewemp(Model m)
	{
		
		List<homeEmployee> list=dao2.getEmployees();
		m.addAttribute("emplist", list);
		return "viewemps";
	}
}
