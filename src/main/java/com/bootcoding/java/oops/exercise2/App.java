package com.bootcoding.java.oops.exercise2;

public class App {
    public static void main(String[] args) {
        Faculty faculty = new Faculty();
        Projector projector = new Projector();
        Projector projector2 = new Projector();
        faculty.startProjector(projector);
        faculty.startProjector(projector2);
        faculty.stopProjector(projector);

        Projector[] ps = new  Projector[5];
        for(int i=0;i< ps.length;i++){
            Projector P = new Projector();
            P.name = "Projector "+ (i+1);
            P.brand = "Epson" + i;
            ps[i] = P;
        }
        faculty.removeProjector(ps);
    }

}
