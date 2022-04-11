public class VariableClass {

    static int x = 5;
    final int y = 10;

    // final keyword is used to fix a variable (not changeable)

    // static- if you use the word static, it means without creating an object
    // you can access the variable or method

    public void method1(){
        System.out.println("This is a non-static method");
    }

    public static void method2(){
        System.out.println("This is a static method");
    }


    public static void main(String[] args){

        System.out.println(x);
        method2();

        // without creating an object of the class VariableClass,
        // you cannot access the variable y or the method method1

        // this is how we create an object of a class
        VariableClass variable1 = new VariableClass();
        // now we can access the method1()
        variable1.method1();




    }
}

