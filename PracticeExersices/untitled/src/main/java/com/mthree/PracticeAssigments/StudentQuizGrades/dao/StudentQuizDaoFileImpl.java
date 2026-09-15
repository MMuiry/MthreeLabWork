package com.mthree.PracticeAssigments.StudentQuizGrades.dao;

import com.mthree.PracticeAssigments.StudentQuizGrades.dto.StudentQuiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentQuizDaoFileImpl  implements StudentQuizDao {
    private Map<String, StudentQuiz> students = new HashMap<>();

    @Override
    public void addStudent(String name, StudentQuiz student) {
        students.put(name, student);
    }

    @Override
    public StudentQuiz removeStudent(String name) {
        students.remove(name);
        return students.get(name);
    }

    @Override
    public List<StudentQuiz> getAllStudentScores() {
        return new ArrayList<StudentQuiz>(students.values());
    }

    @Override
    public StudentQuiz getSpecificStudent(String name) {
        return students.get(name);
    }

}
