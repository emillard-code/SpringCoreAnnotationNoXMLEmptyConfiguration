package com.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Blue implements Color {

    public void color() {
        System.out.println("Blue Casing");
    }

}
