package org.example.entities;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name = "Карлуша";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
