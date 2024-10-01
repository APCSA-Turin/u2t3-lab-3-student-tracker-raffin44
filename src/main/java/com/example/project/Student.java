package com.example.project;

public class Student {
    // instance variables for 
    // first name (String)
    private String firstName;
    // last name (String)
    private String lastName;
    // graduation year (int)
    private int gradYear;
    // sum of test scores (double).. should initialize at 0.0
    private double sum;
    // test score count (int) ..should initialize at 0
    private int numOfTests;
    // highest test score (double).. should initialize at 0.0
    private double highestTestScore;

    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        sum = 0.0;
        numOfTests = 0;
        highestTestScore = 0.0;
    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return highestTestScore;
    }

    public int getTestScoreCount(){
        //implement code here!
        return numOfTests;
    }

    public int getGradYear(){
        //implement code here!
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        sum+=newTestScore;
        numOfTests++;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if (averageTestScore()>=65) {
            return true;
        } else{
            return false;
        }
        //implement code here!
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return sum/numOfTests;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }