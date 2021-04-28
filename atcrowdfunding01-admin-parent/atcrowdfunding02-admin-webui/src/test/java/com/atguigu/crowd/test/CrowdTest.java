package com.atguigu.crowd.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.mapper.AdminMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-persist-mybatis.xml" })
public class CrowdTest {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private AdminMapper adminMapper;
	
	
	@Test
	public void testLog() {
		
		// 1.获取Logger对象，这里传入的Class对象就是当前打印日志的类
		Logger logger = LoggerFactory.getLogger(CrowdTest.class);
		
		// 2.根据不同日志级别打印日志
		logger.debug("Hello I am Debug level!!!");
		logger.debug("Hello I am Debug level!!!");
		logger.debug("Hello I am Debug level!!!");
		
		logger.info("Info level!!!");
		logger.info("Info level!!!");
		logger.info("Info level!!!");
		
		logger.warn("Warn level!!!");
		logger.warn("Warn level!!!");
		logger.warn("Warn level!!!");
		
		logger.error("Error level!!!");
		logger.error("Error level!!!");
		logger.error("Error level!!!");
	}
	
	@Test
	public void testInsertAdmin() {
		Admin admin =  new Admin(null, "tom", "123123", "汤姆", "tom@qq.com", null);
		int count = adminMapper.insert(admin);
		System.out.println("受影响的行数="+count);
	}

	@Test
	public void testConnection() throws SQLException {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

}
