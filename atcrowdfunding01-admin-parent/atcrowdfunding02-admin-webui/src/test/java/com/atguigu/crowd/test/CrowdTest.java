package com.atguigu.crowd.test;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
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
