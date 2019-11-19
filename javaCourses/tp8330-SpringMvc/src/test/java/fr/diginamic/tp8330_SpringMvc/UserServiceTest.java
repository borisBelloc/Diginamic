package fr.diginamic.tp8330_SpringMvc;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import fr.diginamic.tp8330_SpringMvc.config.WebAppMvcConfigurer;
import fr.diginamic.tp8330_SpringMvc.dao.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebAppMvcConfigurer.class)
@Transactional
public class UserServiceTest {
	@Autowired
	private WebApplicationContext context;

	@Autowired
	private UserRepository userRepository;

}