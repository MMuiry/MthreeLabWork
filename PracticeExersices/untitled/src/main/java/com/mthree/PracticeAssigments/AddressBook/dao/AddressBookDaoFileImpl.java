package com.mthree.PracticeAssigments.AddressBook.dao;

import com.mthree.PracticeAssigments.AddressBook.dto.AddressBook;
import com.mthree.PracticeAssigments.ClassRoster.dto.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookDaoFileImpl implements AddressBookDao {
    Map<String, AddressBook> addressBooks = new HashMap<>();
    public static final String ADDRESSBOOK_FILE = "addressBookFile.txt";
    public static final String DELIMITER = "::";


    @Override
    public AddressBook addAddressBook(AddressBook newAddressBook) {
        addressBooks.put(newAddressBook.getfullName(), newAddressBook);
        return newAddressBook;
    }

    @Override
    public AddressBook deleteAddressBook(String name) {
        AddressBook removedAddressBook = addressBooks.remove(name);
        addressBooks.remove(name);
        return removedAddressBook;
    }

    @Override
    public AddressBook lookupSingleAddressBook(String name) {
        AddressBook lookedUpAddress = addressBooks.get(name);
        return lookedUpAddress;
    }

    @Override
    public List<AddressBook> lookUpAddressBooks() {
        return new ArrayList<AddressBook>(addressBooks.values());
    }

    @Override
    public int lookUpAddressBooksCount() {
        return addressBooks.size();
    }

    public AddressBook updateAddressBook(AddressBook updatedAddres) {
        AddressBook addressToUpdate = addressBooks.get(updatedAddres.getfullName());
        addressToUpdate.setAddress(updatedAddres.getNumberAndStreet(),
                updatedAddres.getCity(), updatedAddres.getState(),
                updatedAddres.getZipCode());
        return addressToUpdate;
    }
}
