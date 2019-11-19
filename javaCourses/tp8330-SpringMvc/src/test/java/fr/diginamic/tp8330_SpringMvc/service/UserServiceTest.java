package fr.diginamic.tp8330_SpringMvc.service;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import fr.diginamic.tp8330_SpringMvc.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@TestPropertySource("classpath:application.properties")
@Transactional
public class UserServiceTest {
	@Autowired
	private WebApplicationContext context;
	
	protected MockMvc mockMvc;

	@Autowired
	private UserService userService;
	
	@Before
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void TestClass() {
		User user = new User("Boris", "login1", "password1");
		userService.save(user);
		assertNotNull(user.getId());
	}
	

}