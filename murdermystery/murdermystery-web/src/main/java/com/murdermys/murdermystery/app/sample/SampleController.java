package com.murdermys.murdermystery.app.sample;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.murdermys.murdermystery.domain.service.sample.SampleService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("sample")
public class SampleController {
	
	
	@Autowired
	SampleService sampleService;

    private static final Logger logger = LoggerFactory
            .getLogger(SampleController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @GetMapping("")
    public String home(Locale locale, Model model) {
    	System.out.println(sampleService.findOneBy());

        return "welcome/home";
    }

}
