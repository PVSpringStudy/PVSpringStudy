package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController5 {

	
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO dojSON(){
		
		ProductVO vo = new ProductVO("»ùÇÃ»óÇ°", 4000);
		
		return vo;
		

	}


			
	
	
}
