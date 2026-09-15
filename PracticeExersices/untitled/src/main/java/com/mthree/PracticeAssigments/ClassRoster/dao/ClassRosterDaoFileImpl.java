package com.mthree.PracticeAssigments.ClassRoster.dao;

import com.mthree.PracticeAssigments.ClassRoster.dto.Student;

import java.io.*;
import java.util.*;

//This is the text file-specific implementation of the ClassRosterDao interface.
public class ClassRosterDaoFileImpl implements ClassRosterDao {
    private Map<String, Student> students = new HashMap<>();
    private final String ROSTER_FILE;
    public static final String DELIMITER = "::";

    public ClassRosterDaoFileImpl(){
        ROSTER_FILE = "roster.txt";
    }

    public ClassRosterDaoFileImpl(String rosterTextFile){
        ROSTER_FILE = rosterTextFile;
    }

    private Student unmarshallStudent(String studentAsText){
        String[] studentToken = studentAsText.split(DELIMITER);
        String studentId = studentToken[0];
        Student studentFromFile = new Student(studentId);
        studentFromFile.setFirstName(studentToken[1]);
        studentFromFile.setLastName(studentToken[2]);
        studentFromFile.setCohort(studentToken[3]);
        return studentFromFile;
    }

    private void loadRoster() throws ClassRosterPersistenceException {
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader
                    (new FileReader(ROSTER_FILE)));

        } catch (FileNotFoundException e) {
            throw new ClassRosterPersistenceException("-_- Could not load roster data into memory", e);
        }

        String currentLine;
        Student currentStudent;
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentStudent = unmarshallStudent(currentLine);
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        sc.close();
    }

    private void writeRoster() throws ClassRosterPersistenceException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e){
            throw new ClassRosterPersistenceException(
                    "Could not save student data.", e);
        }
        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for (Student currentStudent : studentList) {
            studentAsText = marshallStudent(currentStudent);
            out.println(studentAsText);
            out.flush();
        }
    }

        private String marshallStudent(Student aStudent){
        String studentAsText = aStudent.getStudentId() + DELIMITER + aStudent.getFirstName() + DELIMITER;
        studentAsText += aStudent.getFirstName() + DELIMITER;
        studentAsText += aStudent.getLastName() + DELIMITER;
        studentAsText += aStudent.getCohort();
        return studentAsText;



    }

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
        loadRoster();
        Student prevStudent = students.put(studentId, student);
        writeRoster();
        return prevStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        loadRoster();
        return new ArrayList<Student>(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        loadRoster();
        Student removedStudent = students.remove(studentId);
        writeRoster();
        return removedStudent;
    }


}
