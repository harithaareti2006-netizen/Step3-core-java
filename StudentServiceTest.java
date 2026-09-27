package com.rabtech.step3;

import com.rabtech.step3.exception.InvalidStudentException;
import com.rabtech.step3.model.Student;
import com.rabtech.step3.service.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private final StudentService service = new StudentService();

    private List<Student> students() throws InvalidStudentException {
        return List.of(
                new Student(1, "Anu", 20, 78),
                new Student(2, "Bala", 21, 35),
                new Student(3, "Charan", 19, 91)
        );
    }

    @Test
    void sortsStudentsByScoreDescending() throws InvalidStudentException {
        var result = service.sortByScoreDescending(students());
        assertEquals("Charan", result.get(0).getName());
        assertEquals("Anu", result.get(1).getName());
    }

    @Test
    void filtersPassedStudents() throws InvalidStudentException {
        var result = service.filterPassed(students());
        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(Student::passed));
    }

    @Test
    void filtersUsingLambdaPredicate() throws InvalidStudentException {
        var result = service.filter(students(), s -> s.getAge() >= 20);
        assertEquals(2, result.size());
    }

    @Test
    void indexesStudentsWithMap() throws InvalidStudentException {
        var result = service.indexById(students());
        assertEquals("Anu", result.get(1).getName());
    }
}
