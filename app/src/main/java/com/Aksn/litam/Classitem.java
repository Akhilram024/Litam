package com.Aksn.litam;

public class Classitem {

    private String ClassName;

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    private String SubjectName;

    public Classitem(String className, String subjectName) {
        ClassName = className;
        SubjectName = subjectName;
    }
}
