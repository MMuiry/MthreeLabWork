package com.mthree.PracticeAssigments.AddressBook.ui;

import com.mthree.PracticeAssigments.AddressBook.dto.AddressBook;

import java.util.List;

public class AddressBookView {
    private UserIO io;

    public AddressBookView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        int menuSelection = 0;
        io.print("Main Menu");
        io.print("1. Add Address");
        io.print("2. Delete Address");
        io.print("3. Find Address");
        io.print("4. List Address Count");
        io.print("5. List All Addresses");
        io.print("6. Update Address");
        io.print("7. Exit");


        return io.readInt("Please select from the above choices: ", 1, 7);
    }

    public AddressBook getNewAddressBookInfo() {
        String fullName = io.readString("Please enter Full name of Person living" +
                " at the address: ");
        String numAndStreet = io.readString("Please enter House number and Street: ");
        String city = io.readString("Please enter City: ");
        String state = io.readString("Please enter State: ");
        String zip =  io.readString("Please enter Postal Code: ");
        AddressBook newAddress = new AddressBook(fullName, numAndStreet, city, state, zip);
        return newAddress;
    }

    public AddressBook getUpdateAddress(String name){
        String numAndStreet = io.readString("Please enter House number and Street: ");
        String city = io.readString("Please enter City: ");
        String state = io.readString("Please enter State: ");
        String zip =  io.readString("Please enter Postal Code: ");
        AddressBook updatedAddress = new AddressBook(name, numAndStreet, city, state, zip);
        return updatedAddress;
    }

    public void displayRemoveAddress(AddressBook addressrecorded){
        if (addressrecorded != null) {
            io.print("Address " + addressrecorded.getNumberAndStreet()
                    + ", " + addressrecorded.getCity()
                    + ", " + addressrecorded.getState()
                    + ", " + addressrecorded.getZipCode() + " has been removed");
        } else {io.print("No Address Was Found");}
        io.readString("Press enter to continue");
    }


    public void displayAllAddress(List<AddressBook> addressrecorded){
        for  (AddressBook currentaddress : addressrecorded) {
            io.print(currentaddress.getfullName() + " : "
                    + currentaddress.getNumberAndStreet()
                    + ", " + currentaddress.getCity()
                    + ", " + currentaddress.getState()
                    + ", " + currentaddress.getZipCode());
        }
        io.readString("Press enter to continue");

    }

    public void displaySingleAddress(AddressBook selectedAddress){
        if  (selectedAddress != null) {
            io.print(selectedAddress.getfullName() + " : "
                    + selectedAddress.getNumberAndStreet()
                    + ", " + selectedAddress.getCity()
                    + ", " + selectedAddress.getState()
                    + ", " + selectedAddress.getZipCode());
        } else {io.print("No Address Was Found");}
        io.readString("Press enter to continue");
    }

    public void displayAddressCount(int count) {
        io.print(count + " Addresses Found");
        io.readString("Press enter to continue");
    }

    public String getAddressName() {
        return io.readString("Name of Person At Address: ");
    }

    public void displayCountBanner() {
        io.print("=== Display ADDRESS Count ===");
    }

    public void displayAllAddressBanner() {
        io.print("=== Display ALL ADDRESS ===");
    }


    public void displayAddressBanner() {
        io.print("=== Display MATCHING ADDRESS ===");
    }

    public void displayRemovedAddressBanner() {
        io.print("=== Display REMOVED ADDRESS ===");
    }
    public void displayAddAddressBanner() {
        io.print("=== ADD ADDRESS ===");
    }



    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }


    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}
