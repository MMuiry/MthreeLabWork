package com.mthree.PracticeAssigments.StateCapital;

import java.util.*;

public class StateCapitals {

    public static void main(String[] args) {
        Map<String, String> StateCapitals = new HashMap<>();
        List<String> lists = new ArrayList<>();
        StateCapitals.put("Alabama", "Montgomery");
        StateCapitals.put("Alaska", "Juneau");
        StateCapitals.put("Arizona", "Phoenix");
        StateCapitals.put("Arkansas", "Little Rock");
        StateCapitals.put("California", "Sacramento");
        StateCapitals.put("Colorado", "Denver");
        StateCapitals.put("Connecticut", "Hartford");
        StateCapitals.put("Delaware", "Dover");
        StateCapitals.put("Florida", "Tallahassee");
        StateCapitals.put("Georgia", "Atlanta");
        StateCapitals.put("Hawaii", "Honolulu");
        StateCapitals.put("Idaho", "Boise");
        StateCapitals.put("Illinois", "Springfield");
        StateCapitals.put("Indiana", "Indianapolis");
        StateCapitals.put("Iowa", "Des Moines");
        StateCapitals.put("Kansas", "Topeka");
        StateCapitals.put("Kentucky", "Frankfort");
        StateCapitals.put("Louisiana", "Baton Rouge");
        StateCapitals.put("Maine", "Augusta");
        StateCapitals.put("Maryland", "Annapolis");
        StateCapitals.put("Massachusetts", "Boston");
        StateCapitals.put("Michigan", "Lansing");
        StateCapitals.put("Minnesota", "Saint Paul");
        StateCapitals.put("Mississippi", "Jackson");
        StateCapitals.put("Missouri", "Jefferson City");
        StateCapitals.put("Montana", "Helena");
        StateCapitals.put("Nebraska", "Lincoln");
        StateCapitals.put("Nevada", "Carson City");
        StateCapitals.put("New Hampshire", "Concord");
        StateCapitals.put("New Jersey", "Trenton");
        StateCapitals.put("New Mexico", "Santa Fe");
        StateCapitals.put("New York", "Albany");
        StateCapitals.put("North Carolina", "Raleigh");
        StateCapitals.put("North Dakota", "Bismarck");
        StateCapitals.put("Ohio", "Columbus");
        StateCapitals.put("Oklahoma", "Oklahoma City");
        StateCapitals.put("Oregon", "Salem");
        StateCapitals.put("Pennsylvania", "Harrisburg");
        StateCapitals.put("Rhode Island", "Providence");
        StateCapitals.put("South Carolina", "Columbia");
        StateCapitals.put("South Dakota", "Pierre");
        StateCapitals.put("Tennessee", "Nashville");
        StateCapitals.put("Texas", "Austin");
        StateCapitals.put("Utah", "Salt Lake City");
        StateCapitals.put("Vermont", "Montpelier");
        StateCapitals.put("Virginia", "Richmond");
        StateCapitals.put("Washington", "Olympia");
        StateCapitals.put("West Virginia", "Charleston");
        StateCapitals.put("Wisconsin", "Madison");
        StateCapitals.put("Wyoming", "Cheyenne");

        System.out.println("\nSTATES:\n=======");
        Set<String> key = StateCapitals.keySet();
        for (String i : key){
            System.out.println(i);
        }
        System.out.println("\nCAPITALS:\n=======");
        for (String i : key){
            System.out.println(StateCapitals.get(i));
        }
        System.out.println("STATE/CAPITAL PAIRS:\n=======");
        for (String i : key) {
            System.out.println(i + " - "  + StateCapitals.get(i));
        }
    }

}
