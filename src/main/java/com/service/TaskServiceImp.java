package com.service;

import com.model.Task;
import com.model.TaskContext;
import com.model.TaskStatus;
import com.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImp  implements  TaskService{
    @Autowired
    TaskRepository taskRepository;


    @Override
    public Task findTaskById(Long taskId) {

        return taskRepository.findTaskWithId(taskId);
    }

    @Override
    public List<Task> findAllTask() {
        return taskRepository.getAllTask();
    }

    @Override
    public String saveTask(TaskContext taskContext) {
        Long maxId=taskRepository.findMaXTaskId();
        if (maxId==null){
            maxId=101L;

        }
        Task task=new Task();
        task.setTaskId(maxId+1);
        task.setTaskHeader(taskContext.getTaskHeader());
        task.setTaskDetail(taskContext.getTaskDetail());
        task.setTaskPoint(taskContext.getTaskPoint());
        task.setStatus(taskContext.getStatus());
        taskRepository.save(task);
        return "Succes";
    }

    @Override
    public String deleteTask(Long taskId) {
        return null;
    }

    @Override
    public String findTaskByHeader(String taskHeader) {
        return null;
    }
}
