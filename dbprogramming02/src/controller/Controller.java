package controller;

import java.util.HashMap;
import java.util.Map;

import service.LoginService;
import service.MemberService;

public class Controller {
	
	public static Map<String, Object> sessionStorage = new HashMap<String, Object>();
	
	public static void main(String[] args) {
		new Controller().init();
		
	}
	
	public void init() {
//		LoginService loginService = LoginService.getInstance(); // LoginService 教臂沛菩畔 按眉 积己
//		loginService.login();
		MemberService memberService = MemberService.getInstance();
//		memberService.signUp();
		memberService.update();
		memberService.searchOne();
		
		
	}
}
