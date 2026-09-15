package com.mthree.PracticeAssigments.ClassRoster.Test;

import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterAuditDao;
import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterPersistenceException;

public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao {

    @Override
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException {
        //do nothing . . .
    }
}