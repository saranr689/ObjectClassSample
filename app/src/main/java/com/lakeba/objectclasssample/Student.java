package com.lakeba.objectclasssample;

/**
 * Created by lakeba01 on 6/2/17.
 */
public class Student implements Cloneable{
    int rollno,age;
    String name,sports;
    private int mark1;

    Student(int rollno,String name,int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public int getMark1() {

        return mark1;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getSports() {
        return sports;
    }
}
