package com.mytests.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * *
 * <p>Created by irina on 17.02.2021.</p>
 * <p>Project: micronaut-gradle</p>
 * *
 */

@Controller("/")
public class MyController {

    @Get("/test1")
    public String test1() {
        return "test1";
    }
}
