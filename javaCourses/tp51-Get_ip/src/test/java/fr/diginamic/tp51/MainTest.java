package fr.diginamic.tp51;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MainTest {

	private MyIpService myIpService;
	private HttpDataService httpDataServiceMock;
	
	
	
	
	@Before
	public void before() {
		httpDataServiceMock = Mockito.mock(HttpDataService.class);
		
		Mockito.when(httpDataServiceMock.getJsonIp()).thenReturn(
				"{\"ip\":\"92.154.66.22\"}"
//				"92.154.66.22"
				);

		myIpService = new MyIpService(httpDataServiceMock);
	}

	@Test
	public void testObtainIp_Classic() {

		// Mock
		String myIpMocked = httpDataServiceMock.getJsonIp();
		// Real
		HttpDataService myHttp = new HttpDataService();
		
		assertEquals("92.154.66.22" , myIpService.getMyIp());
	}
	
	
	
	
	
	
	

}
