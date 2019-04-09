package work.justforstudy.study.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;


@Controller
@RequestMapping("/user")
public class TestController {

	@RequestMapping("/test")
	public String Test() {
		System.out.println("test!!!");
		return "test";
	}

}
