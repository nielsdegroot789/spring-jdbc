package com.example.demo.configurations;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class ProjectConfig {

	@Value("${custom.datasource.url}")
	private String datasourceUrl;
	
	@Value("${custom.datasource.username}")
	private String datasourceUsername;
	
	@Value("${custom.datasource.password}")
	private String datasourcePassword;
	
	@Bean
	public DataSource datasource() {
		HikariDataSource datasource = new HikariDataSource();
		
		datasource.setJdbcUrl(datasourceUrl);
		datasource.setUsername(datasourceUsername);
		datasource.setPassword(datasourcePassword);
		datasource.setConnectionTimeout(1000);
		
		return datasource;
	}
}
