package com.freesiaBloom.ProjectForSpring;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compiling with 404 bugs but faster");
    }
}
