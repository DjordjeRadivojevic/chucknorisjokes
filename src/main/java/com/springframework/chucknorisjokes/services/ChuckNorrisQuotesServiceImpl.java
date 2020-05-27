package com.springframework.chucknorisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesServiceImpl implements ChuckNorrisQuotesService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuotesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
