package com.durg.chatbotapi.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.durg.chatbotapi.repository.DurgChatbotRepository;


@Service
public class DurgChatbotService {

	@Autowired
	DurgChatbotRepository durgChatbotRepository;

	public List<Map<String, Object>> getOptions() {

		List<Map<String, Object>> optionResult = durgChatbotRepository.getOptions();

		return optionResult;
	}
	
	public List<Map<String, Object>> getResidenceOptions() {
		
		List<Map<String, Object>> optionResult = durgChatbotRepository.getResidenceOptions();
		
		return optionResult;
	}
	public List<Map<String, Object>> getBlockOptions() {
		
		List<Map<String, Object>> optionResult = durgChatbotRepository.getBlockOptions();
		
		return optionResult;
	}
}
