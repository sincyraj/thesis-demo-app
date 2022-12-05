package com.vub.thesis.demo.resource;

public record DemoResource(String value) {
    @Override
    public String toString() {
        return "Value = " + value;
    }
}
