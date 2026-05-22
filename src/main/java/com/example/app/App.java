package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        int marks[] = {85, 90, 78, 88, 92};

        double avg = calculateAverage(marks);
        String grade = calculateGrade(avg);

        logger.info("Average Marks: " + avg);
        logger.info("Grade: " + grade);

        System.out.println("Average Marks: " + avg);
        System.out.println("Grade: " + grade);
    }

    public static double calculateAverage(int[] marks) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / (double) marks.length;
    }

    public static String calculateGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else return "Fail";
    }
}
