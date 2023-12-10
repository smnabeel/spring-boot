/**
 * 
 */
package com.mna.container.app._3_application.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;

import com.mna.container.app._3_application.UserApiDelegate;
import com.mna.container.app._4_domain.api.model.User;

/**
 * 
 */
@Component
public class UserApiDelegateImpl implements UserApiDelegate {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return UserApiDelegate.super.getRequest();
	}

	@Override
	public ResponseEntity<User> createUser(User user) {
		// TODO Auto-generated method stub
		return UserApiDelegate.super.createUser(user);
	}

	@Override
	public ResponseEntity<User> createUsersWithListInput(List<User> user) {
		// TODO Auto-generated method stub
		return UserApiDelegate.super.createUsersWithListInput(user);
	}

	@Override
	public ResponseEntity<Void> deleteUser(String username) {
		// TODO Auto-generated method stub
		return UserApiDelegate.super.deleteUser(username);
	}

	@Override
	public ResponseEntity<User> getUserByName(String username) {
		
		return UserApiDelegate.super.getUserByName(username);
	}

	@Override
	public ResponseEntity<String> loginUser(String username, String password) {
		// TODO Auto-generated method stub
		return UserApiDelegate.super.loginUser(username, password);
	}

	@Override
	public ResponseEntity<Void> logoutUser() {
		// TODO Auto-generated method stub
		return UserApiDelegate.super.logoutUser();
	}

	@Override
	public ResponseEntity<Void> updateUser(String username, User user) {
		// TODO Auto-generated method stub
		return UserApiDelegate.super.updateUser(username, user);
	}

}
