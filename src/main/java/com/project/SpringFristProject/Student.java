package com.project.SpringFristProject;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id;
    private String name;

    // 2. No-argument constructor
    public Student() {
    }

    // 3. Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

