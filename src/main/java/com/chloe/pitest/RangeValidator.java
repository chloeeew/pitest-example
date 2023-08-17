package com.chloe.pitest;


class RangeValidator {

    boolean isValid(int input) {
        return input>0 && input <= 100;
    }
    
    String typeOfTriangle(int side1, int side2, int side3){
        if (side1 == side2 && side2 ==side3) {
            return "Equilateral";
        } else if (side1==side2 || side2==side3 || side3 ==side1){
            return "Isosceles";
        }else{
            return "Scalene";
        }
    }
}
