package com.bootcoding.java.oops.exercise2;

public class Faculty {
    public String name;

    public static void startProjector(Projector p){
        System.out.println("The projector has been started");
    }
    public static void stopProjector(Projector p){
        System.out.println("The projector has been stopped");
    }
    public static void removeProjector(Projector[] projectors){

        for(int i=0;i<projectors.length;i++){
            System.out.println("Removed : " + projectors[i].name);

        }
    }
}
