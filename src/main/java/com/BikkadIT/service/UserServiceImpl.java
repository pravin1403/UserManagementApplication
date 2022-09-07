package com.BikkadIT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.binding.LoginForm;
import com.BikkadIT.entity.UserMasterEntity;
import com.BikkadIT.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepository userRepository;

	@Override
	public String loginCheck(LoginForm loginForm) {
		UserMasterEntity userMasterEntity = userRepository.findByEmailAndPassword(loginForm.getEmail(),
				loginForm.getPassword());

		if (userMasterEntity != null) {

			String accountStatus = userMasterEntity.getAccountStatus();
			if (accountStatus.equals("Locked")) {

				return "Your Account is Locked";
			} else {
				return "Login successfull. Welcome to BikkadIT";
			}

		} else {
			return "Credential is Invalid";
		}

	}

}
