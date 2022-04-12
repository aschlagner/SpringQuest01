package com.wildcodeschool.SpringQuest01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringQuest01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuest01Application.class, args);
	}

	@RequestMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {
        return "William Hartnell";
    }

	@RequestMapping("/doctor/7")
    @ResponseBody
    public String doctor7() {
        return "Sylvester McCoy";
    }

	@RequestMapping("/doctor/11")
    @ResponseBody
    public String doctor11() {
        return "Matt Smith";
    }

	@RequestMapping("/doctor/12")
    @ResponseBody
    public String doctor12() {
        return "Peter Capaldi";
    }

	@RequestMapping("/")
    @ResponseBody
    public String index() {
		String result = "<ul>";
		result += "<li><a href='http://localhost:8080/doctor/1'>William Hartnell</a></li>";
		result += "<li><a href='http://localhost:8080/doctor/7'>Sylvester McCoy</a></li>";
		result += "<li><a href='http://localhost:8080/doctor/11'>Matt Smith</a></li>";
		result += "<li><a href='http://localhost:8080/doctor/12'>Peter Capaldi</a></li>";
		result += "</ul>";
        return result;
    }

}
