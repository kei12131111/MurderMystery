package com.murdermys.murdermystery.domain.service.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.murdermys.murdermystery.domain.repository.sample.SampleRepository;

@Service
@Transactional
public class SampleServiceImpl implements SampleService {

	@Autowired
	SampleRepository sampleRepository;
	
	
	@Override
	public String findOneBy() {
		// TODO Auto-generated method stub
		
		String name = sampleRepository.findOneBy();
		
		return name;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

}
