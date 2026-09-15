package com.mthree.PracticeAssigments.ClassRoster.dao;

public interface ClassRosterAuditDao {

    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException;

}