# Step 3 - Core Java OOP, Collections Framework & Exception Hierarchy

This Java 17 project demonstrates the requirements from the internship task:

- Modular domain package with encapsulated entity models and records.
- Java Collections, Streams and Lambdas for sorting and filtering.
- Custom checked and unchecked exceptions for invalid business constraints.
- JUnit 5 test suite.

## Run tests

```bash
mvn test
```

## Main examples

`model/Student` demonstrates encapsulation.

`model/Course` demonstrates a Java record.

`service/StudentService` demonstrates List, Map, sorting, filtering, Streams and Lambdas.

`exception/InvalidStudentException` is a checked exception.

`exception/InvalidCourseException` is an unchecked exception.
