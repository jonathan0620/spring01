package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping
	public String movie(String movie) {
		System.out.println(movie);
		String fileName = "redirect:movie.jsp";
		if (movie.equals("action")) {
			fileName = "action";
		} else if (movie.equals("drama")) {
			fileName = "drama";
		} else if (movie.equals("comic")) {
			fileName = "comic";
		}
		return fileName;
	}
}
