package com.example.demo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.Department;
import com.example.bean.Person;
import com.example.mapper.DepartmentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Person             person;

    @Autowired
    ApplicationContext ioc;

    Logger logger = LoggerFactory.getLogger(getClass());
    
    @Autowired
    DataSource datasource;
    
    @Autowired
    private DepartmentMapper departmentMapper;
    
    @Test
    public void testDepartment() {
    	Department department = new Department();
    	department.setDepartmentName("测试");
    	departmentMapper.insertDept(department);
    	System.out.println(department.getId());
    }
    
    @Test
    public void testDataSource() {
    	System.out.println(datasource.getClass());
    	
    	Connection connection;
		try {
			connection = datasource.getConnection();
			System.out.println(connection);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
    
    @Test
    public void testHelloService() {
        boolean containsBean = ioc.containsBean("helloService");
        System.out.println(containsBean);
        System.out.println(person);
    }

    @Test
    public void contextLoads() {
        // 日志级别由低到高
        logger.trace("跟踪日志");
        logger.debug("调试日志");
        // SpringBoot默认日志级别是info
        logger.info("这是info日志");
        logger.warn("警告");
        logger.error("错误");
    }

}
