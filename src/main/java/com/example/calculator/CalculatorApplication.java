package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/calc/mult")
	public String mult(@RequestParam(name = "op1") String op1, @RequestParam(name = "op2") String op2) {
		int operand1 = Integer.parseInt(op1);
		int operand2 = Integer.parseInt(op2);
		return "" + (operand1 * operand2);
	}


	@GetMapping("/calc/div")
	public String div(@RequestParam(name = "op1") String op1, @RequestParam(name = "op2") String op2) {
		int operand1 = Integer.parseInt(op1);
		int operand2 = Integer.parseInt(op2);
		return "" + (operand1 / operand2);
	}

	@GetMapping("/calc/sum")
	public String sum(@RequestParam(name = "op1") String op1, @RequestParam(name = "op2") String op2) {
		int operand1 = Integer.parseInt(op1);
		int operand2 = Integer.parseInt(op2);
		return "" + (operand1 + operand2);
	}

	@GetMapping("/calc/subtract")
	public String subtract(@RequestParam(name = "op1") String op1, @RequestParam(name = "op2") String op2) {
		int operand1 = Integer.parseInt(op1);
		int operand2 = Integer.parseInt(op2);
		return "" + (operand1 - operand2);
	}

}
