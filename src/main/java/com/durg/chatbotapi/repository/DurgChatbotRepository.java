package com.durg.chatbotapi.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DurgChatbotRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> getOptions() {

		List<Map<String, Object>> queryResult = new ArrayList<>();

		String sqlQuery = "SELECT option_id AS id, option_name AS name FROM option_master WHERE status=1";

		queryResult = jdbcTemplate.queryForList(sqlQuery);

		return queryResult;
	}

	public List<Map<String, Object>> getResidenceOptions() {

		List<Map<String, Object>> queryResult = new ArrayList<>();

		String sqlQuery = "SELECT resi_option_id AS id, resi_option_name AS name FROM residencce_option_master WHERE status=1";

		System.out.println("sqlQuery: " + sqlQuery);

		queryResult = jdbcTemplate.queryForList(sqlQuery);

		return queryResult;
	}

	public List<Map<String, Object>> getBlockOptions() {

		List<Map<String, Object>> queryResult = new ArrayList<>();

		String sqlQuery = "SELECT block_option_id AS id, block_option_name AS name FROM block_option_master WHERE status=1";

		queryResult = jdbcTemplate.queryForList(sqlQuery);

		return queryResult;
	}
}
