package com.example.college_app;

import java.util.ArrayList;

public class student {
    public String getWithaccomotiodation() {
        return withaccomotiodation;
    }

    public void setWithaccomotiodation(String withaccomotiodation) {
        this.withaccomotiodation = withaccomotiodation;
    }

    public String getWithinsruance() {
        return withinsruance;
    }

    public void setWithinsruance(String withinsruance) {
        this.withinsruance = withinsruance;
    }

    String type;

    String  course;
    String  duration;

    String withaccomotiodation;
    String withinsruance;

    int withacc;
    int withm;

    int Result;

    public int getResult() {
        return Result;
    }

    public void setResult(int result) {
        Result = result;
    }

    public int getWithacc() {
        return withacc;
    }

    public void setWithacc(int withacc) {
        this.withacc = withacc;
    }

    public int getWithm() {
        return withm;
    }

    public void setWithm(int withm) {
        this.withm = withm;
    }

    int dur;
    int fee;
    ArrayList<String> courses = new ArrayList<String>();
    ArrayList<String> totalduration = new ArrayList<String>();







    public student() {



    }



    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }


    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
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
