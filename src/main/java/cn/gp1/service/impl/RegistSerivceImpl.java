package cn.gp1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.gp1.dao.*;
import cn.gp1.pojo.*;
import cn.gp1.pojo.Users;
import cn.gp1.service.RegistService;
@Service
public class RegistSerivceImpl implements RegistService {
	
	@Resource
	private UserRepository uRepository;
	
	@Resource
	private BookRepository bRepository;

	@Override
	public Users addUser(Users u) {
		// TODO Auto-generated method stub
		Users u1=this.uRepository.save(u);
		return u1;
	}

	@Override
	public List<Books> findAllBook() {
		// TODO Auto-generated method stub
		
		return this.bRepository.findAll();
	}

	@Override
	public List<Users> findAllUser() {
		// TODO Auto-generated method stub
		return this.uRepository.findAll();
	}

	@Override
	public void deleteUserById(Integer id) {
		// TODO Auto-generated method stub
		this.uRepository.deleteById(id);
	}
	
	
}
