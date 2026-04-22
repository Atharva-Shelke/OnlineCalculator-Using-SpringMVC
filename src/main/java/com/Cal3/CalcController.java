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

	@PostMapping("/calculate")
	public String Calculation(@RequestParam("operation") String operation, @RequestParam("num1") double x,
			@RequestParam("num2") double y, Model model) {
		double result = 0;
		switch (operation) {
		case "addition":
			result = x + y;
			break;
		case "subtraction":
			result = x - y;
			break;
		case "multiplication":
			result = x * y;
			break;
		case "division":
			if (y == 0) {
				model.addAttribute("result", "Cannot divide by zero!");
				return "result";
			}
			result = x / y;
			break;
		}
		model.addAttribute("result", result);
		return "result";
	}
}
