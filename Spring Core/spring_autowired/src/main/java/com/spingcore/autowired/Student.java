package com.spingcore.autowired;


import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    /**
     * without @Autowired Annotation we will get the NUll Pointer Exception
     * because Autowired Annotation is being used to get the values where AppConfig is responsible for creating object
     * Autowire take the bean from the IOC container based on the byName, ByType or ByConstructor
     */
    @Autowired
    private ScienceStudent scienceStudent;
    @Autowired
    private CommerceStudent commerceStudent;
    @Autowired
    private ArtsStudent artsStudent;

    public void checkStudent() {
        scienceStudent.studentSubjects();
        commerceStudent.studentSubjects();
        artsStudent.studentSubjects();
    }
}
