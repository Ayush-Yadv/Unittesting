package com.testingAppilication.test.Application;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class TestApplicationTests {


	@BeforeAll
    static void methodRunBeforeAll(){
		log.info("this annotation run this test case before All test");
	}

	@AfterAll
	static void methodRunAfterAll (){
		log.info("this annotation run this test case After All test");
	}

	@BeforeEach
	@Test
	void methodRunBeforeEach(){
		log.info("this annotation run this test case before every test");
	}

	@AfterEach
	@Test
	void methodRunAfterEach (){
		log.info("this annotation run this test case After every test");
	}

	@Test
	@DisplayName("FirstTestcase")
	void contextLoads() {
     log.info("doing first test");
	}

	 @Test
	void SecondTest(){
		log.info("second test case run");
	 }

	 @Test
	 @Disabled
	void notImportantTest(){
		log.info("it se use for stoping test cases");
	 }


	 @Test
	 void addMethod(){
	  int result=Addmethod(12,13);
		 Assertions.assertThat(result).isEqualTo(25);
	 }

	 @Test
	 void StringMachingTest(){
		String test="ham tumahare hai sanam";
		Assertions.assertThat(test).isEqualTo("ham tumahare hai sanam")
				.endsWith("sanam")
				.startsWith("ham");
	 }

	 int Addmethod(int a, int b ){
		int add=a+b;
		return add;


	 }

}
