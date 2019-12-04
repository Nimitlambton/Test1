package com.example.college_app;

import java.util.ArrayList;

public class student {

    String type;

    String  course;
    String  duration;

    ArrayList<String> courses = new ArrayList<String>();
    ArrayList<String> totalduration = new ArrayList<String>();

    public student() {



    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public ArrayList<String> getTotalduration() {
        return totalduration;
    }

    public void setTotalduration(ArrayList<String> totalduration) {
        this.totalduration = totalduration;
    }
}
