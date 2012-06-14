/**
 * 
 */
package com.sivalabs.jforum.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sivalabs.jforum.entities.User;
import com.sivalabs.jforum.entities.UserLogon;
import com.sivalabs.jforum.repositories.UserRepository;

/**
 * @author skatam
 *
 */
@Service
@Transactional
public class UserService 
{
	@Inject
	private UserRepository userRepository;
	
	public User login(String userName, String password) {
		 /*UserLogon userLogon = userRepository.login(userName, password);
		 if(userLogon !=null){
			 return userLogon.getUser();
		 }
		 return null;*/
		return userRepository.findOne(1);
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public void deleteUser(User user) {
		userRepository.delete(user);
	}
	
	public User getUser(int userId) {
		return userRepository.findOne(userId);
	}
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	public boolean changePwd(Integer userId, String pwd, String newPwd)
	{
		return userRepository.changePwd(userId, pwd, newPwd)!=0;
	}
}
