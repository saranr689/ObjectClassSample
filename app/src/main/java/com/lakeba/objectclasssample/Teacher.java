package com.lakeba.objectclasssample;

/**
 * Created by lakeba01 on 6/2/17.
 */
public class Teacher  {
    private final String name;
    private final Integer id;
    private final int age;

    public Teacher(int id, String name, int age) {

        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        Teacher teacher = (Teacher)obj;
        return teacher.id.equals(id) ;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
