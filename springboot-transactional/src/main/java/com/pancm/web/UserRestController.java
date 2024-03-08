package com.pancm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pancm.dao.UserDao;
import com.pancm.pojo.User;
import com.pancm.service.UserService;



/**
 * 
* @Title: UserRestController
* @Description: 
* 用户控制层
* @Version:1.0.0  
* @author pancm
* @date 2018年3月19日
 */
@RestController
@RequestMapping(value = "/api/user")
public class UserRestController {

	@Autowired
    private UserService userService;
	
	@Autowired
	private UserDao userDao;
	

	@PostMapping("/test1")
    public boolean test1(@RequestBody User user) {
		System.out.println("请求参数:" + user);
		try {
			userService.test1(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("最后查询的数据:" + userDao.findById(user.getId()));
        return true;
    }
    
	@PostMapping("/test2")
    public boolean test2(@RequestBody User user) {
		System.out.println("请求参数:" + user);
		userService.test2(user);
		System.out.println("最后查询的数据:" + userDao.findById(user.getId()));
        return true;
    }
	
	
	@PostMapping("/test3")
    public boolean test3(@RequestBody User user) {
		System.out.println("请求参数:" + user);
		userService.test3(user);
		System.out.println("最后查询的数据:" + userDao.findById(user.getId()));
        return true;
    }
	
	@PostMapping("/test4")
    public boolean test4(@RequestBody User user) {
		System.out.println("请求参数:" + user);
		userService.test4(user);
		System.out.println("最后查询的数据:" + userDao.findById(user.getId()));
        return true;
    }
	

}
