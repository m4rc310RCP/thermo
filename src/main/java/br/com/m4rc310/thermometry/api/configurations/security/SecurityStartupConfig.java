package br.com.m4rc310.thermometry.api.configurations.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import br.com.m4rc310.gql.MUserProvider;
import br.com.m4rc310.gql.dto.MUser;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableCaching
@EnableWebMvc
public class SecurityStartupConfig {
	
	@Lazy
	@Autowired
	private PasswordEncoder pe;
	
	@Lazy
	@Bean
	MUserProvider loadUserProvider() {
		return new MUserProvider() {
			
			@Override
			public boolean isValidUser(MUser user) {
				log.info("{}", user);
				return true;
			}
			
			@Override
			public MUser getUserFromUsername(String username) {
				MUser user = new MUser();
				user.setUsername(username);
				user.setPassword(pe.encode("test"));
				user.setRoles("admin".split(";"));
				return user;
			}
			
			@Override
			public MUser authUser(String username, Object password) throws Exception {
				
				log.info(username);
				
				MUser user = getUserFromUsername(username);
				if (encoder.matches(String.valueOf(password), user.getPassword())) {
					return user;
				}

				throw new Exception("User error!");
			}
		};
	}

}
