package com.example.busporject;

public class dataModel {

    private String initial,destination;

    public dataModel(String initial, String destination) {
        this.initial = initial;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }
}
