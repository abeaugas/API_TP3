package com.example.TP3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {
	@PostMapping("/meteo")
	public String showMeteo(@RequestParam(name="address") String address, Model model) {
		model.addAttribute("addresse", address);
		System.out.println(address);
        return "meteo";
    }
}
