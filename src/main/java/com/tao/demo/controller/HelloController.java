package com.tao.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tao.demo.entity.User;
import com.tao.demo.mapper.UserMapper;

@Controller
public class HelloController {
	@Resource
	private UserMapper userMapper;
	
	@RequestMapping("/home")
	@ResponseBody
	public String getHome() {
		return "hello";
	}
	@RequestMapping(method=RequestMethod.PUT ,value="/put/{id}")
	public String get(@PathVariable String id) {
		return id;
	}
	@RequestMapping("/getUsers")
	@ResponseBody
	public List<User> getUsers() {
		List<User> all = userMapper.getAll();
		return all;
	}
}
