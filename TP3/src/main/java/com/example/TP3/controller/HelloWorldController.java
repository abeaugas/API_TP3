package com.example.TP3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="nameGET", required=false, defaultValue="World") String nameGET, Model model) { // Paramètres dans l'url
        model.addAttribute("nomTemplate", nameGET); // Récupérer le paramètre qui est dans "nameGET" et le ranger dans "nomTemplate" présent dans le html
        return "greeting"; // Dire quelle page on veut afficher
    }
}
