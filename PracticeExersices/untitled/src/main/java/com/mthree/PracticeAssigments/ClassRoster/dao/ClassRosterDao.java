package com.mthree.PracticeAssigments.ClassRoster.dao;

//This interface defines the methods that must be implemented by any class that wants to play the role of DAO in the application.
//We will implement a text file-based DAO in the code-along.
//You could imagine, however, an implementation that only stored student data in memory or one that stored student data in a database.
//Each class would be different but all would implement that same interface, ensuring that they are all well encapsulated.
//Note that the ClassRosterController only uses this interface to reference the DAO — it is completely unaware of the implementation details.


import com.mthree.PracticeAssigments.ClassRoster.dto.Student;

import java.util.List;

/*
 Adds the given Student to the roster and associates it with the given
  student id. If there is already a student associated with the given
  student id it will return that student object, otherwise it will
  return null.

  @param studentId id with which student is to be associated
  @param student student to be added to the roster
  @return the Student object previously associated with the given
  student id if it exists, null otherwise
 */
public interface ClassRosterDao {
    Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException;
    List<Student> getAllStudents() throws ClassRosterPersistenceException;
    Student getStudent(String studentId) throws ClassRosterPersistenceException;
    Student removeStudent(String studentId) throws ClassRosterPersistenceException;



}
