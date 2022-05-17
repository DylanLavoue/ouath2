package com.example;

import io.micronaut.http.annotation.*;

@Controller("/ouath2")
public class Ouath2Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}