package com.controller;

import com.model.Task;
import com.service.TaskServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class WebServiceController {
    @Autowired
    private TaskServiceImp taskServiceImp;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Task> getAllTask(){
        return taskServiceImp.findAllTask();
    }

    @RequestMapping(value = "/list/{id}",method = RequestMethod.GET)
    public Task findByTaskId(@PathVariable("id") Long id){
        return taskServiceImp.findTaskById(id);
    }

}
