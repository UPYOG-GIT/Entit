package com.durg.chatbotapi.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ApiResponse {

	@JsonProperty("data")
	List<Map<String, Object>> data;
	
	@JsonProperty("status")
	int status;
	
	@JsonProperty("statusMessage")
	String statusMessage;
	
}
