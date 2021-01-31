package com.repository;

import com.model.Task;
import com.model.TaskStatus;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public interface TaskRepository extends CrudRepository<Task,Long> {

    @Query(value = "SELECT t FROM Task t WHERE t.taskId=:task_Id")
    public Task findTaskWithId(@Param("task_Id") Long taskId);

    @Query(value = "SELECT t FROM Task t WHERE t.status=:task_Status")
    public List<Task> findTaskWithStatus(@Param("task_Status") TaskStatus taskStatus);

    @Query(value="SELECT t from Task t")
    public List<Task> getAllTask();

     @Query(value ="SELECT MAX(t.taskId) FROM Task t")
    public Long findMaXTaskId();

     @Query(value = "SELECT t FROM Task t WHERE t.taskHeader=:task_header")
     public List<Task> findTaskWithTaskHeader(@Param("task_header") String taskHeader);

}
