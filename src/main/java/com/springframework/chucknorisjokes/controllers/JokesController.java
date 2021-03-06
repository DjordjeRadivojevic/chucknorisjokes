package com.springframework.chucknorisjokes.controllers;

import com.springframework.chucknorisjokes.services.ChuckNorrisQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    public final ChuckNorrisQuotesService chuckNorrisQuotesService;

    public JokesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @RequestMapping({"/",""})
    public String getJokes(Model model){
        model.addAttribute("joke",chuckNorrisQuotesService.getRandomQuote());
        System.out.println("checking jenkins working");
        return "chucknorris";
    }
}
