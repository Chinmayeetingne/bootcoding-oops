package com.bootcoding.java.oops.exercise2;

public class Faculty {
    public String name;

    public static void startProjector(Projector p){
        System.out.println("The projector has been started");
    }
    public static void stopProjector(Projector p){
        System.out.println("The projector has been stopped");
    }
    public static void removeProjector(Projector p){
        System.out.println("The projector is removed");
        Projector[] Ps = new  Projector[5];
        for(int i=0;i< Ps.length;i++){
            Projector P = new Projector();
            P.name = "Projector "+ i;
            Ps[i] = P;
        }
    }
}
