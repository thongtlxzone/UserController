package com.example.demo.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "sub_job")
//@IdClass(SubJobId.class)
public class SubJobEntity {
//    @Id
//    int userId;
//    @Id
//    int jobId;
    @EmbeddedId
    SubJobId subJobId;
    @Column(name = "name_subjob")
    String name;
//    @ManyToOne
//    @JoinColumn()
//    private UsersEntity users;
//    @ManyToOne
//    @JoinColumn(name = "job_id")
//    private JobsEntity jobs;

//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public int getJobId() {
//        return jobId;
//    }
//
//    public void setJobId(int jobId) {
//        this.jobId = jobId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public UsersEntity getUsers() {
//        return users;
//    }
//
//    public void setUsers(UsersEntity users) {
//        this.users = users;
//    }
//
//    public JobsEntity getJobs() {
//        return jobs;
//    }
//
//    public void setJobs(JobsEntity jobs) {
//        this.jobs = jobs;
//    }
}
