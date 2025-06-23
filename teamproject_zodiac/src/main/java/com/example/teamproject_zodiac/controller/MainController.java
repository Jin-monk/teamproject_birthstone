package com.example.teamproject_zodiac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.teamproject_zodiac.entity.Zodiac;
import com.example.teamproject_zodiac.repository.ZodiacRepository;

@Controller
public class MainController {
	
	@Autowired
	private ZodiacRepository zodiacRepository;
	

	@GetMapping("/")
    public String formPage() {
        return "zodiacForm"; 
    }

    @GetMapping("/zodiac")
    public String getZodiac(@RequestParam("month") int month,
            				@RequestParam("day") int day,
            				Model model) {

        Zodiac zodiac = zodiacRepository.getZodiacSign(month, day);
        model.addAttribute("zodiac", zodiac);
        
        return "result"; 
        
    }
}
