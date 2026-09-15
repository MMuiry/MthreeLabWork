package com.mthree.PracticeAssigments.ClassRoster.service;

import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterPersistenceException;
import com.mthree.PracticeAssigments.ClassRoster.dto.Student;

import java.util.List;

public interface ClassRosterServiceLayer {

    void createStudent(Student student) throws
            ClassRosterDuplicateIdException,
            ClassRosterDataValidationException,
            ClassRosterPersistenceException;

    List<Student> getAllStudents() throws
            ClassRosterPersistenceException;

    Student getStudent(String studentId) throws
            ClassRosterPersistenceException;

    Student removeStudent(String studentId) throws
            ClassRosterPersistenceException;
}
