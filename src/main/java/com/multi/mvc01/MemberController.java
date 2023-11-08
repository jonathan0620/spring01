package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 싱글톤 객체 생성 + 컨트롤러 역할을 하는 클래스로도 설정
public class MemberController {

	//요청 하나당 함수 하나
	@RequestMapping("insert")
	public void insert(MemberDTO bag) {
		System.out.println(bag);
	}
	
	public void login() {
		
	}
}
