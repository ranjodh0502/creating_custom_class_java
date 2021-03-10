package com.company;


class Employe{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

public class ch8_practice {
    public static void main(String[] args) {
        Employe ranjodh = new Employe();
        ranjodh.setName("Ranjodh Singh");
        System.out.println(ranjodh.getName());
        ranjodh.salary=34000;
        System.out.println(ranjodh.getSalary());
    }
}
