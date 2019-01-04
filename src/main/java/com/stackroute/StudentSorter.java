package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student>
{

    @Override
    public int compare(Student s1, Student s2) {
        int name = s1.getName().compareTo(s2.getName());
        int id = s1.getId();
        if(s1.getAge() > s2.getAge())
        {
           return 1;
        }
        else if(s1.getAge() == s2.getAge())
        {
            return name;
        }
        else if(s1.getName()==s2.getName() && s1.getAge()==s2.getAge())
        {
            return id;
        }
        return -1;
    }
}
