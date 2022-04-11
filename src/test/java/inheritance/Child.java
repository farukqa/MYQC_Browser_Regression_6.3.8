package inheritance;

public class Child extends Parent{

    String firstName;
    String lastName;

    // constructor to assign a first name
    Child(String firstName){
        // to access the super class constructor, use the super keyword as the first line
        super();
        this.firstName = firstName;

    }



// method to display the full name of the child
    public void display(){
        System.out.println("My full name is "+firstName+" "+super.lastName);


    }




}

