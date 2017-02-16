package zhongqiu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zhongqiu.ehcache.EhcacheDemo;


@Controller
@RequestMapping("/EhcacheDemo")
public class EhcacheDemoController {
	@RequestMapping("hello")
	public String hello(Model model) {
		EhcacheDemo.ehcacheDemo();
		model.addAttribute("hello", "页面静态化");
		return "hello";
	}
}
