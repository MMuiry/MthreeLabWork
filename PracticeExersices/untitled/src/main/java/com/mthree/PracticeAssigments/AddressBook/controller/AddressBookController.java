package com.mthree.PracticeAssigments.AddressBook.controller;

import com.mthree.PracticeAssigments.AddressBook.dao.AddressBookDao;
import com.mthree.PracticeAssigments.AddressBook.dao.AddressBookException;
import com.mthree.PracticeAssigments.AddressBook.dto.AddressBook;
import com.mthree.PracticeAssigments.AddressBook.ui.AddressBookView;
import com.mthree.PracticeAssigments.AddressBook.ui.UserIO;
import com.mthree.PracticeAssigments.AddressBook.ui.UserIOConsoleImpl;

public class AddressBookController {
    private UserIO io = new UserIOConsoleImpl();
    private AddressBookView view;
    private AddressBookDao dao;

    public AddressBookController(AddressBookDao dao, AddressBookView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;

        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        addAddress();
                        break;
                    case 2:
                        deleteAddress();
                        break;
                    case 3:
                        findAddress();
                        break;
                    case 4:
                        listAddressCount();
                        break;
                    case 5:
                        listAllAddress();
                        break;
                    case 6:
                        updateAddress();
                        break;
                    case 7:
                        keepGoing = false;
                        break;
                }

            }

            exitMessage();
        } catch (AddressBookException e) {
            view.displayErrorMessage(e.getMessage());
        }


    }

    private void addAddress() {
        view.displayAddAddressBanner();
        AddressBook addressBook = view.getNewAddressBookInfo();
        dao.addAddressBook(addressBook);
    }

    private void deleteAddress() {
        view.displayRemovedAddressBanner();
        AddressBook removedAddress = dao.deleteAddressBook(view.getAddressName());
        view.displayRemoveAddress(removedAddress);
    }

    private void findAddress() {
        view.displayAddressBanner();
        AddressBook lookupAddress = dao.lookupSingleAddressBook(view.getAddressName());
        view.displaySingleAddress(lookupAddress);
    }

    private void listAddressCount() {
        view.displayCountBanner();
        view.displayAddressCount(dao.lookUpAddressBooksCount());
    }

    private void listAllAddress() {
        view.displayAllAddressBanner();
        view.displayAllAddress(dao.lookUpAddressBooks());
    }

    private void updateAddress(){
        String addresName = view.getAddressName();
        AddressBook addressToUpdate = dao.lookupSingleAddressBook(addresName);
        view.displaySingleAddress(addressToUpdate);
        if (addressToUpdate != null) {
            AddressBook updatedAddress = view.getUpdateAddress(addresName);
            dao.updateAddressBook(updatedAddress);
        }
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
}
