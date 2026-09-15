package com.mthree.PracticeAssigments.ClassRoster.controller;

import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterDao;
import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterPersistenceException;
import com.mthree.PracticeAssigments.ClassRoster.dto.Student;
import com.mthree.PracticeAssigments.ClassRoster.service.ClassRosterDataValidationException;
import com.mthree.PracticeAssigments.ClassRoster.service.ClassRosterDuplicateIdException;
import com.mthree.PracticeAssigments.ClassRoster.service.ClassRosterServiceLayer;
import com.mthree.PracticeAssigments.ClassRoster.ui.ClassRosterView;
import com.mthree.PracticeAssigments.ClassRoster.ui.UserIO;
import com.mthree.PracticeAssigments.ClassRoster.ui.UserIOConsoleImpl;

import java.util.List;

//This is the orchestrator of the application. It knows what needs to be done, when it needs to be done, and what component can do the job.
public class ClassRosterController  {
    private UserIO io = new UserIOConsoleImpl();
    private ClassRosterView view;
    private ClassRosterServiceLayer service;

    public ClassRosterController(ClassRosterServiceLayer service, ClassRosterView view) {
        this.service = service;
        this.view = view;
    }
    public void run(){
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        displayAllStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        displayStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                }

            }

            exitMessage();
        } catch (ClassRosterPersistenceException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }


    private void exitMessage() {
        view.displayExitBanner();
    }

    private int getMenuSelection(){
        return view.printMenuAndGetSelection();
    }

    private void displayAllStudents() throws ClassRosterPersistenceException {
        List<Student> studentList = service.getAllStudents();
        view.displayDisplayAllBanner();
        view.displayStudentList(studentList);
    }

    private void createStudent() throws ClassRosterPersistenceException {
        view.displayCreateStudentBanner();
        boolean hasErrors = false;
        do {
            Student currentStudent = view.getNewStudentInfo();
            try {
                service.createStudent(currentStudent);
                view.displayCreateSuccessBanner();
                hasErrors = false;
            } catch (ClassRosterDuplicateIdException | ClassRosterDataValidationException e) {
                hasErrors = true;
                view.displayErrorMessage(e.getMessage());
            }
        } while (hasErrors);
    }

    private void displayStudent() throws ClassRosterPersistenceException {
        view.displayStudentBanner();
        String usrchoice = view.getStudentIdChoice();
        Student student = service.getStudent(usrchoice);
        view.displaySingleStudent(student);
    }

    private void removeStudent() throws ClassRosterPersistenceException {
        view.displayRemovedStudentBanner();
        String usrchoice = view.getStudentIdChoice();
        Student student = service.removeStudent(usrchoice);
        view.displayRemoveStudent(student);
    }

}

