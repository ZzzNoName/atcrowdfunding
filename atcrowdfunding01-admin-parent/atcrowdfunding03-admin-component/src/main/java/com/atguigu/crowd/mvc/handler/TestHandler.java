package com.atguigu.crowd.mvc.handler;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.crowd.service.api.AdminService;

@Controller
public class TestHandler {
	@Autowired
	private AdminService adminService;
	private final Logger logger = LoggerFactory.getLogger(TestHandler.class);
	@RequestMapping(value = "/test/ssm.html",method=RequestMethod.GET)
	public String testSsm(ModelMap map,HttpServletRequest request) {
		logger.debug("testSsm");
		return "target";
	}

}
