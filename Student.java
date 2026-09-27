package com.rabtech.step3.model;

import com.rabtech.step3.exception.InvalidStudentException;

public final class Student {
    private final int id;
    private String name;
    private int age;
    private double score;

    public Student(int id, String name, int age, double score) throws InvalidStudentException {
        if (id <= 0) throw new InvalidStudentException("Student id must be positive");
        if (name == null || name.isBlank()) throw new InvalidStudentException("Student name is required");
        if (age < 16 || age > 100) throw new InvalidStudentException("Age must be between 16 and 100");
        if (score < 0 || score > 100) throw new InvalidStudentException("Score must be between 0 and 100");
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getScore() { return score; }

    public void setName(String name) throws InvalidStudentException {
        if (name == null || name.isBlank()) throw new InvalidStudentException("Student name is required");
        this.name = name;
    }

    public void setScore(double score) throws InvalidStudentException {
        if (score < 0 || score > 100) throw new InvalidStudentException("Score must be between 0 and 100");
        this.score = score;
    }

    public boolean passed() {
        return score >= 40;
    }
}
