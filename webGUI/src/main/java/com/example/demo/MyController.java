package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
@GetMapping
public String mypage()
{
	return "NewFile";
}
}
