package com.rabtech.step3;

import com.rabtech.step3.exception.InvalidStudentException;
import com.rabtech.step3.model.Course;
import com.rabtech.step3.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    @Test
    void checkedExceptionRejectsInvalidStudent() {
        assertThrows(InvalidStudentException.class,
                () -> new Student(1, "", 20, 80));
    }

    @Test
    void checkedExceptionRejectsInvalidScore() {
        assertThrows(InvalidStudentException.class,
                () -> new Student(1, "Anu", 20, 101));
    }

    @Test
    void recordRejectsInvalidCourseCredits() {
        assertThrows(IllegalArgumentException.class,
                () -> new Course("CS101", "Core Java", 0));
    }

    @Test
    void encapsulatedStudentCanBeUpdatedThroughValidation() throws InvalidStudentException {
        Student student = new Student(1, "Anu", 20, 70);
        student.setScore(90);
        assertEquals(90, student.getScore());
    }
}
