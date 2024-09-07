package com.quizlier.common.entity;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.quizlier.common.entity.auth.User;
import com.quizlier.common.entity.auth.UserRole;
import org.junit.jupiter.api.Test;

public class UserTests {
	
	@Test
	public void testGettersAndSetters() {
		User user = new User();
		
		user.setId(1L);
		user.setFirstName("Jane");
		user.setLastName("Doe");
		user.setUsername("jeandoe");
		user.setEmail("jean.doe@gmail.com");
		user.setUserRole(UserRole.ADMIN);
		user.setPassword("password101");
		user.setCreated_at(new Date());
		user.setUpdated_at(new Date());
		
		assertEquals(1L, user.getId());
		assertEquals("Jane", user.getFirstName());
		assertEquals("Doe", user.getLastName());
		assertEquals("jeandoe", user.getUsername());
		assertEquals("jean.doe@gmail.com", user.getEmail());
		assertEquals(UserRole.ADMIN, user.getUserRole());
		assertEquals("password101", user.getPassword());
		assertNotNull(user.getCreated_at());
		assertNotNull(user.getUpdated_at());
	}

}
