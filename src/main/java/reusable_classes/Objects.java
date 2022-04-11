package reusable_classes;

public class Objects {

    String type = "mammal";
    int eyes = 2;
    int legs = 4;
    int thirdEye;

    public void Objects(int y){

       thirdEye = y;
       System.out.println(y);



    }

    public static void main(String[] args){



        Objects dog1 = new Objects();
        System.out.println(dog1.type);
        System.out.println(dog1.eyes);
        System.out.println(dog1.legs);
        dog1.Objects(1);

        Objects dog2 = new Objects();
        System.out.println(dog2.type);
        System.out.println(dog2.eyes);
        System.out.println(dog2.legs);





    }
}

