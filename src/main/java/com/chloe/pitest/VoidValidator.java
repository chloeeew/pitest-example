package com.chloe.pitest;

class VoidValidator {

    void doSomething(int i){
        String a = String.valueOf(i) + "doSomething";
    }

    int voidMethodValidate(){
        int a = 5;
        doSomething(a);
        return a;
    }
}
