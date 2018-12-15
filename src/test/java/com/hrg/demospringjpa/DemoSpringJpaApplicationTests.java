package com.hrg.demospringjpa;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hrg.demospringjpa.controller.dto.UserDto;
import com.hrg.demospringjpa.entity.UserEntity;
import com.hrg.demospringjpa.repository.UserRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSpringJpaApplicationTests {

	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void contextLoads() {
		
//		Assert.assertEquals(4, userRepository.findAll().size());
		
//		Assert.assertEquals(2, userRepository.findListPart("a").size());
		
		List<UserEntity> list = userRepository.findListPart2("a");
		
		for (UserEntity user : list) {
			
			System.out.println(user.getUserName() +":" + user.getPassword());
			
		}
		
		
	}

}

