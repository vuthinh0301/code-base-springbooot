package com.atomic.codebasespringboot;

import com.atomic.codebasespringboot.repository.RedisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodeBaseSpringbootApplicationTests {

	@Autowired
	private RedisRepository redisRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRedis() {
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while(count++ < 3) {
			int y = (1 + 2 * count) % 3;
			switch(y) {
				default: break;
				case 0: x -= 1; break;
				case 1: x += 5;
			}
		}

		System.out.println(x);
	}

}
