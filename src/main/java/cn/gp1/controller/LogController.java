package cn.gp1.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.gp1.pojo.Users;
import cn.gp1.service.LoginService;

@Controller
public class LogController {
		
		@Resource
		private LoginService lservice;
	
		@RequestMapping("/login")
		public String loginPage(){
			return "loginPage";
		}
		
		@RequestMapping("/dologin")
		public String dologin(String name,String pwd){
			Users u=this.lservice.getById(name);
			if(u.getUpwd().equals(pwd)){
				return "main";
			}
			return "loginPage";
		}
		
		@RequestMapping("/main")
		public String mainPage(){
			return "mainPage";
		}
}
