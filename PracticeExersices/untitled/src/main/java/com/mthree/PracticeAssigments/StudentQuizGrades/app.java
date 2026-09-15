package com.mthree.PracticeAssigments.StudentQuizGrades;


import com.mthree.PracticeAssigments.StudentQuizGrades.controller.StudentQuizController;
import com.mthree.PracticeAssigments.StudentQuizGrades.dao.StudentQuizDao;
import com.mthree.PracticeAssigments.StudentQuizGrades.dao.StudentQuizDaoFileImpl;
import com.mthree.PracticeAssigments.StudentQuizGrades.ui.StudentQuizView;
import com.mthree.PracticeAssigments.StudentQuizGrades.ui.UserIO;
import com.mthree.PracticeAssigments.StudentQuizGrades.ui.UserIOImpl;

public class app {
    public static void main(String[] args) {
        UserIO myIo = new UserIOImpl();
        StudentQuizView myView = new StudentQuizView(myIo);
        StudentQuizDao myDao = new StudentQuizDaoFileImpl();
        StudentQuizController cntrll = new StudentQuizController(myDao, myView);
        cntrll.run();
    }
}
