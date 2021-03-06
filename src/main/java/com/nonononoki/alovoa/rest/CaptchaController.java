package com.nonononoki.alovoa.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nonononoki.alovoa.entity.Captcha;
import com.nonononoki.alovoa.service.CaptchaService;

@RestController
@RequestMapping("/captcha")
public class CaptchaController {
	
	@Autowired
	private CaptchaService captchaService;
	
	@GetMapping("/generate")
	public Captcha generate() {	
		return captchaService.generate();
	}
}
