package org.example.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Мяк";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
