package org.staticvariableandmethod;

public class StaticStudent {

    int rollno;
    String name;
    static String college = "PCPK";
    //static method to change the value of static variable
    static void change(){
        college = "PCPK";
    }
    //constructor to initialize the variable
    StaticStudent(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String args[]){
        StaticStudent.change();//calling change method
        //creating objects
        StaticStudent s1 = new StaticStudent(111,"Kajal");
        StaticStudent s2 = new StaticStudent(222,"Lata");
        StaticStudent s3 = new StaticStudent(333,"Teju");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
