package ru.kosenko.test;

public class ClassicalMusic implements Music {

    public String getSong() {
        return "Victoria";
    }

    public void doMyInit(){
        System.out.println("Doing initialization");
    }
    public void doMyDestroy(){
        System.out.println("Doing destroy");
    }
}
