package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.BirthstoneDayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
public class BirthstoneController {

	private final BirthstoneDayRepository birthstoneDayRepository;

	@GetMapping("/")
	public String root() {
		return "index";
	}

	@GetMapping("/birthstones")
	public String birthstoneForm() {
		return "birthstone";
	}

	@GetMapping("/birthstones/search")
	public String searchBirthstone(@RequestParam("month") int month, @RequestParam("day") int day, Model model) {
		var result = birthstoneDayRepository.findByMonthAndDay(month, day);

		if (result.isPresent()) {
			var gemstone = result.get().getGemstone();
			model.addAttribute("birthstone", gemstone);
		} else {
			model.addAttribute("error", "해당 날짜의 탄생석이 없습니다.");
		}

		return "result";
	}

	@GetMapping("/result")
	public String result() {
		return "result";
	}

}
