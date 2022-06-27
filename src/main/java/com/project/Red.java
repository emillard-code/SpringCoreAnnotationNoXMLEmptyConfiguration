package com.project;

import org.springframework.stereotype.Component;

@Component
public class Red implements Color {

    public void color() {
        System.out.println("Red Casing");
    }

}
