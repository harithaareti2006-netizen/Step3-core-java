package com.rabtech.step3.model;

public record Course(String code, String name, int credits) {
    public Course {
        if (code == null || code.isBlank()) throw new IllegalArgumentException("Course code is required");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Course name is required");
        if (credits <= 0) throw new IllegalArgumentException("Credits must be positive");
    }
}
