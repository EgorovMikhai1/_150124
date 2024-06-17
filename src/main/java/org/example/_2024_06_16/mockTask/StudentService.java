package org.example._2024_06_16.mockTask;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс StudentService
 * Описание: Этот класс содержит бизнес-логику для работы с данными студентов и курсов.
 * Поля:
 * StudentRepository studentRepository: репозиторий для управления данными.
 * Методы:
 * void registerStudent(Student student): регистрирует нового студента.
 * void enrollStudentToCourse(String studentId, String courseId): записывает студента на курс.
 * void assignGrade(String studentId, String courseId, int grade): присваивает оценку студенту по курсу.
 * Map<String, Integer> getStudentGrades(String studentId): возвращает оценки студента.
 * double calculateAverageGrade(String studentId): рассчитывает среднюю оценку студента.
 * List<Student> getStudentsWithGradesAbove(int grade): возвращает список студентов с оценками выше указанного значения.
 * List<String> getTopPerformingStudents(int n): возвращает список лучших студентов по средним оценкам.
 * void loadStudentsFromFile(String filePath) throws IOException: загружает студентов из файла.
 * void loadCoursesFromFile(String filePath) throws IOException: загружает курсы из файла.
 */
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void registerStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void enrollStudentToCourse(String studentId, String courseId) {
        studentRepository.enrollStudentToCourse(studentId, courseId);
    }

    public void assignGrade(String studentId, String courseId, int grade) {
        studentRepository.updateGrade(studentId, courseId, grade);
    }

    public Map<String, Integer> getStudentGrades(String studentId) {
        return null;
    }

    public double calculateAverageGrade(String studentId) {
        return 0.0;
    }

    public List<Student> getStudentsWithGradesAbove(int grade) {
        return null;
    }

    public List<String> getTopPerformingStudents(int n) {
        return null;
    }

    public void loadStudentsFromFile(String filePath) throws IOException {

    }

    public void loadCoursesFromFile(String filePath) throws IOException {
    }
}