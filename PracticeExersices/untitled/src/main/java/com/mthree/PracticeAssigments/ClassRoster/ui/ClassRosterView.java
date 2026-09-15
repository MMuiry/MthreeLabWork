package com.mthree.PracticeAssigments.ClassRoster.ui;

import com.mthree.PracticeAssigments.ClassRoster.dto.Student;

import java.util.List;

//This class handles all the UI logic.
public class ClassRosterView {

    private UserIO io;

    public ClassRosterView(UserIO io) {
        this.io = io;
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public int printMenuAndGetSelection() {
        int menuSelection = 0;
        io.print("Main Menu");
        io.print("1. List Student IDs");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices: ", 1, 5);
    }

    public Student getNewStudentInfo() {
        String studentId = io.readString("Please enter Student ID");
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        String cohort = io.readString("Please enter Cohort");
        Student currentStudent = new Student(studentId);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        return currentStudent;
    }

    public void displayCreateStudentBanner() {
        io.print("=== Create Student ===");
    }


    public void displayCreateSuccessBanner() {
        io.readString(
                "Student successfully created.  Please hit enter to continue");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Display All Students ===");
    }

    public void displayStudentList(List<Student> studentList) {
        for (Student currentStudent : studentList) {
           io.print(currentStudent.getStudentId() + " : " + currentStudent.getFirstName() + " " + currentStudent.getLastName() );
        }
        io.readString("Please press enter to continue");
    }

    public void displaySingleStudent(Student student) {
        if (student != null) {

            io.print(student.getStudentId() + " : " +
                    student.getFirstName() + " " +
                    student.getLastName() + " : " + student.getCohort());

        } else {io.print("Student not found");}
        io.readString("Please hit enter to continue.");

    }

    public String getStudentIdChoice() {
        return io.readString("Student ID: ");
    }

    public void displayStudentBanner() {
        io.print("=== Display MATCHING Student ===");
    }
    public void displayRemovedStudentBanner() {
        io.print("=== Display REMOVED Student ===");
    }
    public void displayRemoveStudent(Student studentRecoreded){
        if (studentRecoreded != null) {
            io.print("Student " + studentRecoreded.getFirstName() + " " + studentRecoreded.getLastName() + " has been removed");
        } else {io.print("No student by that ID exsits");}
        io.readString("Press enter to continue");
    }
    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }
}
