package com.Cal3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
	
	@GetMapping("/")
	public String display() {
		return "Calculator3";
	}
	
	@PostMapping("/")
	public String Calculation(@RequestParam("operation") String operation,
			@RequestParam("num1") int x,
			@RequestParam("num2") int y,
			Model model) {
		int result=0;
		if (operation.equals("addition")) {
			result=x+y;
		}
		else if(operation.equals("subtraction")) {
			result=x-y;
		}
		else if(operation.equals("multiplication")) {
			result=x*y;
		}
		else if(operation.equals("division")) {
			result=x/y;
		}
		model.addAttribute("result",result);
		return "result";
		}
	}
