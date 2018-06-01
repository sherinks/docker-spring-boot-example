package com.sks.springboot.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class PersistanceConfiguration {

	@Value("${spring.dataSource.username}")
	String userName;
	
	@Value("${spring.dataSource.password}")
	String password;
	
	@Value("${spring.dataSource.jdbcUrl}")
	String jdbcUrl;
	
	@Value("${spring.dataSource.driver-class-name}")
	String driver;
	
	
	@Bean
	public DataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		dataSource.setJdbcUrl(jdbcUrl);
		dataSource.setDriverClassName(driver);
		dataSource.setMaximumPoolSize(10);
		
		return dataSource;
	}
	
}
