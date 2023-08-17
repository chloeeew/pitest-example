package com.chloe.pitest;


class RangeValidator {

    boolean isValid(int input) {
        return input>0 && input <= 100;
    }
    
    String classifyScore(int score){
        if (score < 0 || score > 100) {
            return "Invalid";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
