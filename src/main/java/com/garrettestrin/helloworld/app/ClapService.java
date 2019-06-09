package com.garrettestrin.helloworld.app;

import com.garrettestrin.helloworld.api.Clap;

public class ClapService {

    public Clap clappify(String message){
        return new Clap(message.replaceAll(" ", "\uD83D\uDC4F"));
    }
}
