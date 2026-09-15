package com.mthree.PracticeAssigments.StudentQuizGrades.dao;

import com.mthree.PracticeAssigments.StudentQuizGrades.dto.StudentQuiz;

import java.util.ArrayList;
import java.util.List;

public interface StudentQuizDao {
    void addStudent(String name, StudentQuiz student);
    StudentQuiz removeStudent(String name);
    List<StudentQuiz> getAllStudentScores();
    StudentQuiz getSpecificStudent(String name);
}
