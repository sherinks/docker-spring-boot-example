package com.sks.springboot.services;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDataController {

	@Autowired
	DataSource dataSource;

	@RequestMapping("/users")
	public List<String> getUserData() {
		final List<String> users = new ArrayList<>();
		JdbcTemplate template = new JdbcTemplate(dataSource);
		template.query("select * from users", (rse) -> {
			users.add(rse.getString("user_name"));
		});
		return users;
	}

}
