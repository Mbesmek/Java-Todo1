package com.model;

public class TaskContext {

    private Long taskId;
    private String taskHeader;
    private  String taskDetail;
    private Long taskPoint;
    private TaskStatus status;

    public TaskContext(Long taskId, String taskHeader, String taskDetail, Long taskPoint, TaskStatus status) {
        this.taskId = taskId;
        this.taskHeader = taskHeader;
        this.taskDetail = taskDetail;
        this.taskPoint = taskPoint;
        this.status = status;
    }

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
