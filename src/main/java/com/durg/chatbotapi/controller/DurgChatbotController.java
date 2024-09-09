package com.durg.chatbotapi.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durg.chatbotapi.model.ApiResponse;
import com.durg.chatbotapi.service.DurgChatbotService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/durg/data")
public class DurgChatbotController {

	@Autowired
	DurgChatbotService durgChatbotService;

	@PostMapping("/_getoptions")
	public ResponseEntity<ApiResponse> getMainCategory() {

		List<Map<String, Object>> optionData = new ArrayList<>();

		optionData = durgChatbotService.getOptions();

		ApiResponse response;

		if (optionData.size() > 1) {
			response = ApiResponse.builder().data(optionData).status(200).statusMessage("success").build();
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response = ApiResponse.builder().data(optionData).status(400).statusMessage("error").build();
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@PostMapping("/_getresdoptions")
	public ResponseEntity<ApiResponse> getResidenceOptions() {

		List<Map<String, Object>> optionData = new ArrayList<>();

		optionData = durgChatbotService.getResidenceOptions();

		ApiResponse response;

		if (optionData.size() > 1) {
			response = ApiResponse.builder().data(optionData).status(200).statusMessage("success").build();
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response = ApiResponse.builder().data(optionData).status(400).statusMessage("error").build();
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@PostMapping("/_getblockoptions")
	public ResponseEntity<ApiResponse> getBlockOptions() {

		List<Map<String, Object>> optionData = new ArrayList<>();

		optionData = durgChatbotService.getBlockOptions();

		ApiResponse response;

		if (optionData.size() > 1) {
			response = ApiResponse.builder().data(optionData).status(200).statusMessage("success").build();
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response = ApiResponse.builder().data(optionData).status(400).statusMessage("error").build();
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	
}
