package com.model;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name="task")
public class Task {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "task_id")
    private Long taskId;
    private String taskHeader;
    private  String taskDetail;
    private Long taskPoint;
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskHeader() {
        return taskHeader;
    }

    public void setTaskHeader(String taskHeader) {
        this.taskHeader = taskHeader;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public Long getTaskPoint() {
        return taskPoint;
    }

    public void setTaskPoint(Long taskPoint) {
        this.taskPoint = taskPoint;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
