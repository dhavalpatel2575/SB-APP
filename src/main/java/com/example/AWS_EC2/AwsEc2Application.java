package com.example.AWS_EC2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsEc2Application {

	@GetMapping("/welcome")
	public String welcome(){
		return "Hello";
	}

	@GetMapping("/welcome2")
	public String welcome2(){
		return "Hello2";
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsEc2Application.class, args);
	}

}
