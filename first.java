package com.company;

class A{
    private int number;

    public A(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}

public class Main {

    public static void main(String[] args) {
        A a = new A(20);
        System.out.println(a.getNumber());
    }
}