package com.mthree.PracticeAssigments.AddressBook.dao;

import com.mthree.PracticeAssigments.AddressBook.dto.AddressBook;

import java.util.List;

public interface AddressBookDao {
    AddressBook addAddressBook(AddressBook newAddressBook);
    AddressBook deleteAddressBook(String name);
    AddressBook lookupSingleAddressBook(String String);
    List<AddressBook> lookUpAddressBooks();
    int lookUpAddressBooksCount();
    AddressBook updateAddressBook(AddressBook updatedAddres);
}

