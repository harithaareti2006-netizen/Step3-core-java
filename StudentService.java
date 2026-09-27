package com.rabtech.step3.service;

import com.rabtech.step3.exception.InvalidStudentException;
import com.rabtech.step3.model.Student;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class StudentService {

    public List<Student> sortByScoreDescending(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .toList();
    }

    public List<Student> filterPassed(List<Student> students) {
        return students.stream()
                .filter(Student::passed)
                .toList();
    }

    public List<Student> filter(List<Student> students, Predicate<Student> condition) {
        return students.stream()
                .filter(condition)
                .toList();
    }

    public Map<Integer, Student> indexById(List<Student> students) {
        return students.stream()
                .collect(Collectors.toMap(Student::getId, student -> student));
    }

    public Student createStudent(int id, String name, int age, double score)
            throws InvalidStudentException {
        return new Student(id, name, age, score);
    }
}
