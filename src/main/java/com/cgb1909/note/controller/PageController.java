package com.cgb1909.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	
	@RequestMapping("doIndexUI")
	public String doIndexUI()
	{
		return "starter";
	}
	@RequestMapping("doLoginUI")
	public String doLoginUI()
	{
		return "login";
	}
	@RequestMapping("textEdit")
	public String doTextEdit()
	{
		return "sys/text_edit";
	}
}
