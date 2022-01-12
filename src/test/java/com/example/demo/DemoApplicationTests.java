package com.example.demo;

import com.example.demo.domain.Usuario;
import com.example.demo.repository.IUsuarioRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	IUsuarioRepo usuarioRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Test
	void contextLoads() {
	}

	@Test
	void createUserTest(){
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setUsername("Leo");

		String password = passwordEncoder.encode("Admin");
		usuario.setPassword(password);

		Usuario user = usuarioRepo.save(usuario);
		Assertions.assertNotNull(user);
	}

}
