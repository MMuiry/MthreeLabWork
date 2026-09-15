package com.mthree.PracticeAssigments.AddressBook.dao;

import com.mthree.PracticeAssigments.AddressBook.dto.AddressBook;
import com.mthree.PracticeAssigments.ClassRoster.dao.ClassRosterDaoFileImpl;
import com.mthree.PracticeAssigments.ClassRoster.dto.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookDaoFileImplTest {
    AddressBookDao testDao;

    @BeforeEach
    public void setUp() throws Exception{
        testDao = new AddressBookDaoFileImpl();;
    }

    @Test
    void addAddressBook() {
        AddressBook newAddress = new AddressBook("Teehan Muir","20 Morrsion Street", "Edin", "Scotland", "EH3 8BJ");
        testDao.addAddressBook(newAddress);
        AddressBook retrievedStudent = testDao.lookupSingleAddressBook("Teehan Muir");

        // Check the data is equal
        assertEquals(newAddress.getfullName(),
                retrievedStudent.getfullName(),
                "Checking student id.");
        assertEquals(newAddress.getCity(),
                retrievedStudent.getCity(),
                "Checking Address name.");
        assertEquals(newAddress.getNumberAndStreet(),
                retrievedStudent.getNumberAndStreet(),
                "Checking Address Street.");
        assertEquals(newAddress.getState(),
                retrievedStudent.getState(),
                "Checking Address State.");
        assertEquals(newAddress.getZipCode(),
                retrievedStudent.getZipCode(),
                "Checking Address Zip Code.");
    }

    @Test
    void deleteAddressBook() {
        AddressBook address1 = new AddressBook("Teehan Muir","20 Morrsion Street", "Edin", "Scotland", "EH3 8BJ");
        AddressBook address2 = new AddressBook("John Jones","30 captin street", "Glas", "England", "EH3 9HE");
        testDao.addAddressBook(address1);
        testDao.addAddressBook(address2);

        AddressBook removedStudent = testDao.deleteAddressBook("Teehan Muir");
        assertEquals(removedStudent, address1, "The removed Address should be Teehan Muir");
        List<AddressBook> allAddress = testDao.lookUpAddressBooks();
        assertNotNull(allAddress, "Address Book should not be null");
        assertEquals(allAddress.size(), 1, "Address Book size should be 1");

        assertFalse(allAddress.contains(address1), "Address Teehan should be empty");
        assertTrue(allAddress.contains(address2), "Address John Jones should still be in it");

        removedStudent = testDao.deleteAddressBook("John Jones");

        assertEquals(removedStudent, address2, "The removed Address should be John Jones");
        allAddress = testDao.lookUpAddressBooks();
        assertTrue(allAddress.isEmpty(), "Address Book should be empty");
        AddressBook retrivedAddress = testDao.lookupSingleAddressBook("John Jones");
        assertNull(retrivedAddress,"The retrieved Address of John Jones should be null");

        retrivedAddress = testDao.lookupSingleAddressBook("Teehan Muir");
        assertNull(retrivedAddress,"The retrieved Address of Teehan Muir should be null");


    }

    @Test
    void lookUpAddressBooks() {
        List<AddressBook> currentstate = testDao.lookUpAddressBooks();
        assertTrue(currentstate.isEmpty(), "Address Book should be null");

        AddressBook address1 = new AddressBook("Teehan Muir","20 Morrsion Street", "Edin", "Scotland", "EH3 8BJ");
        testDao.addAddressBook(address1);

        currentstate = testDao.lookUpAddressBooks();
        assertEquals(1, currentstate.size(),"Address Book should be 1");
    }

    @Test
    void lookUpAddressBooksCount() {
        int count = testDao.lookUpAddressBooksCount();
        assertEquals(0, count, "Theres should be nothing to count yet");

        AddressBook address1 = new AddressBook("Teehan Muir","20 Morrsion Street", "Edin", "Scotland", "EH3 8BJ");
        testDao.addAddressBook(address1);

        count = testDao.lookUpAddressBooksCount();
        assertEquals(1, count, "Theres should be 1 count");

        testDao.deleteAddressBook("Teehan Muir");
        count = testDao.lookUpAddressBooksCount();

        assertEquals(0, count, "There should be zero after the removal");

    }

    @Test
    void updateAddressBook() {
        AddressBook address1 = new AddressBook("Teehan Muir","20 Morrsion Street", "Edin", "Scotland", "EH3 8BJ");
        AddressBook updateToAddress = new AddressBook("Teehan Muir","30 captin street", "Glas", "England", "EH3 9HE");
        assertThrows(NullPointerException.class, () -> {
            testDao.updateAddressBook(address1);
        });
        testDao.addAddressBook(address1);
        AddressBook updatedAddress = testDao.updateAddressBook(updateToAddress);
        assertEquals(updateToAddress, updatedAddress, "Address Book has not been updated");
    }
}