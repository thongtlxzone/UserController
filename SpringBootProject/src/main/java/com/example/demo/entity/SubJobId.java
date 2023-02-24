package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SubJobId implements Serializable {
    @Column(name = "user_id")
    private int userId;
    @Column(name = "job_id")
    private int jobId;

    public SubJobId(int userId, int jobId) {
        this.userId = userId;
        this.jobId = jobId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }
}
