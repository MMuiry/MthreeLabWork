package com.mthree.PracticeAssigments.StudentQuizGrades.controller;


import com.mthree.PracticeAssigments.ClassRoster.controller.ClassRosterController;
import com.mthree.PracticeAssigments.StudentQuizGrades.dao.StudentQuizDao;
import com.mthree.PracticeAssigments.StudentQuizGrades.dto.StudentQuiz;
import com.mthree.PracticeAssigments.StudentQuizGrades.ui.StudentQuizView;
import com.mthree.PracticeAssigments.StudentQuizGrades.ui.UserIO;
import com.mthree.PracticeAssigments.StudentQuizGrades.ui.UserIOImpl;

import java.util.ArrayList;
import java.util.List;

public class StudentQuizController {
    private UserIO io = new UserIOImpl();
    private StudentQuizView view;
    private StudentQuizDao dao;

    public StudentQuizController (StudentQuizDao dao, StudentQuizView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run(){
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    displayStudent();

                    break;
                case 3:
                    createStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    studentAverageScore();
                    break;
                case 6:
                    keepGoing = false;
                    break;
            }
        }
        exitMessage();


    }

    private void studentAverageScore(){
        view.displayAverageScoreBanner();
        String userChoice = view.getStudentNameChoice();
        StudentQuiz student = dao.getSpecificStudent(userChoice);
        view.displayStudentAverage(student);
    }

    private int getMenuSelection() {return view.printMenuAndGetSelection();}

    private void displayAllStudents() {
        List<StudentQuiz> studentList = dao.getAllStudentScores();
        view.displayDisplayAllBanner();
        view.displayAllStudents(studentList);
    }

    private void createStudent() {
        view.displayCreateStudentBanner();
        StudentQuiz newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getName(), newStudent);
        view.displayCreateStudentBanner();
    }

    private void displayStudent() {
        view.displayStudentBanner();
        String userChoice = view.getStudentNameChoice();
        StudentQuiz student = dao.getSpecificStudent(userChoice);
        view.displaySingleStudent(student);
    }

    private void removeStudent() {
        view.displayRemovalBanner();
        String userChoice = view.getStudentNameChoice();
        StudentQuiz student = dao.removeStudent(userChoice);
        view.displayRemoveStudent(student);

    }

    private void exitMessage() {
        io.print("GoodBye!");
    }
}
