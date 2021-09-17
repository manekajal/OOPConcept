package org.constructor;

public class ParameterizedConstructor {

    public String name;
    public int  salary;

    public ParameterizedConstructor(String name , int salary)
    {
        this.name=name;
        this.salary=salary;
    }

    public static void main(String[] args)
    {
        ParameterizedConstructor pc = new ParameterizedConstructor("kajal",1234);

        System.out.println(pc.name);
        System.out.println(pc.salary);
    }
}
