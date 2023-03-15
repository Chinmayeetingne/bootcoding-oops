package com.bootcoding.java.oops.exercise2;

public class App {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Projector projector = new Projector();
        Projector projector2 = new Projector();
        faculty.startProjector(projector);
        faculty.startProjector(projector2);
        faculty.removeProjector(projector);
    }

}
