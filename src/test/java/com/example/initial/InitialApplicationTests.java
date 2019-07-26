package com.example.initial;

import com.example.initial.request.RequestInput;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InitialApplicationTests {

	@Test
	public void contextLoads() {
		RequestInput request = new RequestInput();
	}

}
