package inheritance;

public class Parent {

    String lastName = "X";

    // Parent class constructor

    Parent(){
        System.out.println("I can swim.");
    }

    public void driving(){
        System.out.println("I can drive");
    }
    public void drivingSpeed(int maxSpeed){
        System.out.println("I can drive at max "+maxSpeed+" mph");
    }

}

