package com.mthree.PracticeAssigments.ClassRoster;

import com.mthree.PracticeAssigments.ClassRoster.controller.ClassRosterController;
import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterAuditDao;
import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterAuditDaoFileImpl;
import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterDao;
import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterDaoFileImpl;
import com.mthree.PracticeAssigments.ClassRoster.service.ClassRosterServiceLayer;
import com.mthree.PracticeAssigments.ClassRoster.service.ClassRosterServiceLayerImpl;
import com.mthree.PracticeAssigments.ClassRoster.ui.ClassRosterView;
import com.mthree.PracticeAssigments.ClassRoster.ui.UserIO;
import com.mthree.PracticeAssigments.ClassRoster.ui.UserIOConsoleImpl;

public class App {
        public static void main(String[] args) {
            UserIO myIo = new UserIOConsoleImpl();
            ClassRosterView myView = new ClassRosterView(myIo);
            ClassRosterDao myDao = new ClassRosterDaoFileImpl();
            ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
            ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
            ClassRosterController cntrll = new ClassRosterController(myService, myView);
            cntrll.run();
        }
}
