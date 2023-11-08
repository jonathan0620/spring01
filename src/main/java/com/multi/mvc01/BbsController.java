package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 + 컨트롤러 등록 
public class BbsController {

	//요청하나당 함수하나.
	@RequestMapping("insert2")
	public void insert2(BbsDTO2 bag) {
		System.out.println(bag);
		//db처리 --> views/insert2.jsp결과를 출력해주세요.
		BbsDAO dao = new BbsDAO();
		int result = dao.insert(bag);
		System.out.println(result);
	}
	
	@RequestMapping("update2")
	public String update2(BbsDTO2 bag) {
		BbsDAO dao = new BbsDAO();
	 	int result = dao.update(bag);
	 	//views에 update2.jsp를 만드세요.
	 	if(result == 1) {
	 		return "ok";
	 	}else{
	 		return "no";
	 	}
	}
}