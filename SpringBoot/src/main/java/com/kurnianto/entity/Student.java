package com.kurnianto.entity;

public class Student {

    private int id;
    private String name;
    private String course;

    public Student() {};

    public Student(int _id, String _name, String _course)
    {
        this.id = _id;
        this.name = _name;
        this.course = _course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
