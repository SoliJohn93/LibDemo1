package cn.gp1.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gp1.dao.UserRepository;
import cn.gp1.pojo.Users;
import cn.gp1.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	
	@Resource
	private UserRepository uRepository;

	@Override
	public Users getById(String name) {
		// TODO Auto-generated method stub
		return this.uRepository.getOne(name);
	}
	
	

	
	
}
