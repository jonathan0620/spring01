package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("insert3")
	public void insert3(ProductDTO dto) {
		//1. 받아서 dto에 넣기
		//2. dao 이용해서 db처리
		ProductDAO dao = new ProductDAO();
		int result = dao.insert(dto);
		//3. 결과를 jsp로 만들어서 실행 후 html 코드를 브라우저에 보내기
	}
}
