package com.example.dictionary.controllers;

import com.example.dictionary.services.IDictionaryService;
import com.example.dictionary.services.impl.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {

    @Autowired
    private IDictionaryService dictionaryService = new DictionaryService();

    @GetMapping("/dictionary")
    public String display() {
        return "index";
    }

    @PostMapping("/search")
    public String findWord(@RequestParam("eng") String eng, Model model) {
        String result = dictionaryService.findWord(eng);
        if (result == null) {
            model.addAttribute("result", "Word not found!");
        }else {
            model.addAttribute("result", result);
        }
        return "index";
    }
}
