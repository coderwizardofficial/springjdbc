package com.coderwizard.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/coderwizard/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate=(JdbcTemplate)context.getBean("jdbcTemplate");
		String sql = "insert into employee value(?,?,?)";
		//int result=jdbcTemplate.update(sql, new Integer(1),"Pramod", "Rai");
		//System.out.println(result);
		
		//jdbcTemplate.update()
	
		
	}

}
