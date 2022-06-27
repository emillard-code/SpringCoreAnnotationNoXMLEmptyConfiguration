package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

    @Autowired
    MobileProcessor cpu;

    @Autowired
    @Qualifier("red")
    Color phoneColor;

    public void config() {
        System.out.println("Octa Core, 4GB Ram, 12 MP Camera");
        phoneColor.color();
        cpu.process();
    }

}
