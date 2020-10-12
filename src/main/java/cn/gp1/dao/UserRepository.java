package cn.gp1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.gp1.pojo.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
	
}
