package com.mthree.PracticeAssigments.StudentQuizGrades.ui;

import com.mthree.PracticeAssigments.ClassRoster.dto.Student;
import com.mthree.PracticeAssigments.StudentQuizGrades.dto.StudentQuiz;

import java.util.ArrayList;
import java.util.List;

public class StudentQuizView {
    private UserIO io;

    public StudentQuizView(UserIO io) {
        this.io = io;
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public int printMenuAndGetSelection() {
        int menuSelection = 0;
        io.print("Main Menu");
        io.print("1. List All Student and their scores");
        io.print("2. List A Single Student score");
        io.print("3. Add Student");
        io.print("4. Remove Student");
        io.print("5. Display Student AVG Quiz Grade");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices: ", 1, 6);
    }

    public StudentQuiz getNewStudentInfo() {
        String name = io.readString("Please enter Student Name: ");
        String stringScores = io.readString("Please enter scores seperated by ',': ");
        String[] splitScores = stringScores.split(",");
        ArrayList<Integer> scores = new ArrayList<>();
        for  (String s : splitScores) {
            scores.add(Integer.parseInt(s.trim()));
        }
        StudentQuiz newStudent =  new StudentQuiz(name, scores);
        return newStudent;
    }

    public void displayAllStudents(List<StudentQuiz> studentList) {
        for (StudentQuiz currentStudent : studentList) {
            io.print(currentStudent.getName() + " : " + currentStudent.getStudentsScore());
        }
        io.readString("Please press Enter To Continue");
    }

    public void displaySingleStudent(StudentQuiz student) {
        if (student != null) {
            io.print(student.getName() + " : " + student.getStudentsScore());
        }
    }

    public void displayRemoveStudent(StudentQuiz studentRecoreded){
        if (studentRecoreded != null) {
            io.print("Student " + studentRecoreded.getName() + " has been removed");
        } else {io.print("No student by that Name exsits");}
        io.readString("Press enter to continue");
    }

    public void displayStudentAverage(StudentQuiz student){
        student.getStudentsScore();
        ArrayList<Integer> score = student.getStudentsScore();
        int total = 0;
        for (int s: score) {
            total += s;
        }
        double avgTotal = (double) total / score.size();
        io.print(student.getName() + " : " + avgTotal);
    }

    public String getStudentNameChoice() {
        return io.readString("Student Name: ");
    }

    public void displayCreateStudentBanner() {
        io.print("=== CREATE STUDENT ===");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All STUDENT ===");
    }

    public void displayAverageScoreBanner() {
        io.print("=== Display STUDENT AVG SCORE ===");
    }

    public void displayStudentBanner() {
        io.print("=== Display MATCHING STUDENT ===");
    }

    public void displayRemovalBanner() {
        io.print("=== REMOVING STUDENT ===");
    }

    public void displayAddSuccessBanner() {
        io.print("=== USER ADDED SUCCESSFULLY ===");
    }


}
