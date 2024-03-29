package com.example.initial.Model;

import java.io.Serializable;

public class Grid implements Serializable {

    private String id;
    private String name;

    public Grid(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
