package com.mthree.PracticeAssigments.AddressBook;

import com.mthree.PracticeAssigments.AddressBook.controller.AddressBookController;
import com.mthree.PracticeAssigments.AddressBook.dao.AddressBookDao;
import com.mthree.PracticeAssigments.AddressBook.dao.AddressBookDaoFileImpl;
import com.mthree.PracticeAssigments.AddressBook.dto.AddressBook;
import com.mthree.PracticeAssigments.AddressBook.ui.AddressBookView;
import com.mthree.PracticeAssigments.AddressBook.ui.UserIO;
import com.mthree.PracticeAssigments.AddressBook.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        AddressBookView view = new AddressBookView(io);
        AddressBookDao dao = new AddressBookDaoFileImpl();
        AddressBookController controller = new AddressBookController(dao,view);
        controller.run();
    }
}
