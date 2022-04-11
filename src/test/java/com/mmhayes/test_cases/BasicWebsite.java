package com.mmhayes.test_cases;

public class BasicWebsite {
    int tabNumber = 3;
    String tab1 = "Home";
    String tab2 = "POS";
    String tab3 = "MYQC";
    String extraTab1;
    String extraTab2;
    int extraTabNum;

    // this is a class constructor
    // it does not return anything
    public BasicWebsite(int num,String extraTab1,String extraTab2){
        extraTabNum = num;
        this.extraTab1 = extraTab1;
        this.extraTab2 = extraTab2;
    }
    // This is another constructor with the same class name
    // this is constructor overloading
    public BasicWebsite(){

    }

    // this is a method
    public void maxTraffic(int traffic){
        System.out.println("The max traffic you can have "+traffic);
    }

    public static void main(String[] args){
        //cust1
        BasicWebsite cust1 = new BasicWebsite();
       System.out.println("cust1 has "+cust1.tabNumber+" tabs");
        System.out.println("The tabs are: \n"+cust1.tab1+"\n"+cust1.tab2+"\n"+cust1.tab3);
        cust1.maxTraffic(10000);


        //cust2
        BasicWebsite cust2 = new BasicWebsite(2,"KIOSK","OMS");
        System.out.println("cust2 has "+cust2.tabNumber+" tabs");
        System.out.println("The tabs are: \n"+cust2.tab1+"\n"+cust2.tab2+"\n"+cust2.tab3);
        cust2.maxTraffic(15000);
        System.out.println(cust2.extraTab1);
        System.out.println(cust2.extraTab2);
        System.out.println(cust2.extraTabNum);

    }
}

