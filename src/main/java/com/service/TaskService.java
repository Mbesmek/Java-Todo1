package com.service;

import com.model.Task;
import com.model.TaskContext;
import com.model.TaskStatus;

import java.util.List;

public interface TaskService {
    public Task findTaskById(Long taskId);
    public List<Task> findTaskByStatus(TaskStatus Status);
    public List<Task> findAllTask();
    public String saveTask(TaskContext taskContext);
    public String editTask(TaskContext taskContext);
    public String deleteTask(Long taskId);
    public String findTaskByHeader(String taskHeader);

}
