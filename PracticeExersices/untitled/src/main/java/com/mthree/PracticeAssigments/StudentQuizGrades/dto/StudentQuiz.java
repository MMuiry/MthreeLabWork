package com.mthree.PracticeAssigments.StudentQuizGrades.dto;

import java.util.*;

public class StudentQuiz {
    public String name;
    public ArrayList<Integer> score = new ArrayList<>();

    public StudentQuiz(String name, ArrayList<Integer> score) {
        this.score =  score;
        this.name = name;
    }

    public ArrayList<Integer> getStudentsScore() {
        return score;
    }

    public String getName() {
        return name;
    }
}
