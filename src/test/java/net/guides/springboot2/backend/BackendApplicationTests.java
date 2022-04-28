package net.guides.springboot2.backend;

import net.guides.springboot2.backend.model.User;
import net.guides.springboot2.backend.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

	@Autowired
	UserRepository userRep;

	@Test
	void contextLoads() {
	}

	/*@Test
	void testUsername(){
		User u = userRep.findByUsername("jassem");
		System.out.println(u);
	}*/

}
