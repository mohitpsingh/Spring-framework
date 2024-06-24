package com.springcore.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public Family familyInfo(Integer familyCount) {
        Family family = new Family();
        family.setTotalMember(familyCount);
        return family;
    }

    public Job jobInfo(String jobName) {
        Job job = new Job();
        job.setJobName(jobName);
        return job;
    }

    @Bean
    public Person getPersonInfo() {
        Person person = new Person();
        person.setPersonName("Jack");
        person.setJob(jobInfo("Software Developer"));
        person.setFamily(familyInfo(12));
        return person;
    }

    @Bean
    public Person getPersonInfo2() {
        Person person = new Person();
        person.setPersonName("Tommy");
        person.setJob(jobInfo("Doctor"));
        person.setFamily(familyInfo(5));
        return person;
    }
}
