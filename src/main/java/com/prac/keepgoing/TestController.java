package com.prac.keepgoing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prac.keepgoing.bean.TestBean;
import com.prac.keepgoing.service.TestService;

@Controller
public class TestController {
	@Autowired			//사용할 서비스를 Inject(=plus)
	TestService service;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test(Model model) throws Exception{
		List<TestBean> list;
		list = service.test();
		model.addAttribute("list", list);		//DB에서 불러온 값은 Model에 담는다.
		
		return "test";
		
	}
}
