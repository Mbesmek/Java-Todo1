package com.controller;

import com.model.Task;
import com.model.TaskContext;
import com.model.TaskStatus;
import com.service.TaskServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/frontend/task")
public class FrontendController {
    @Autowired
    private TaskServiceImp taskServiceImp;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getAllTask(Model model) {
        List<Task> tasks = taskServiceImp.findAllTask();
        model.addAttribute("tasks",tasks);
        return "thyme_tasks_list";

    }

    @RequestMapping(value = "/list/inprogress", method = RequestMethod.GET)
    public String getInprogressTask(Model model) {
        TaskStatus status=TaskStatus.INPROGRESS;
        List<Task> tasks = taskServiceImp.findTaskByStatus(status);
        model.addAttribute("ınprogress",tasks);
        return "thyme_tasks_list";

    }
    @RequestMapping(value = "/list/done", method = RequestMethod.GET)
    public String getDoneTask(Model model) {
        TaskStatus status=TaskStatus.DONE;
        List<Task> tasks = taskServiceImp.findTaskByStatus(status);
        model.addAttribute("done",tasks);
        return "thyme_tasks_list";

    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String saveTask(@ModelAttribute TaskContext context, Model model) {
      model.addAttribute("context",context);
        return "thyme_task_save";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String SaveBook(@ModelAttribute TaskContext context, Model model){

        taskServiceImp.saveTask(context);
        model.addAttribute("tasks",taskServiceImp.findAllTask());
        return "thyme_tasks_list";
    }
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public String getEditTaskPage(@RequestParam Long id, Model model){
        Task task= taskServiceImp.findTaskById(id);
        model.addAttribute("context",task);
        return "thyme_task_edit";
    }
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    private String editBook(@ModelAttribute TaskContext context,Model model){
        taskServiceImp.editTask(context);
        model.addAttribute("task",taskServiceImp.findAllTask());
        return "thyme_tasks_list";
    }


    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String deleteTask(@ModelAttribute Long id, Model model){

        taskServiceImp.deleteTask(id);
        model.addAttribute("tasks",taskServiceImp.findAllTask());
        return "thyme_tasks_list";
    }


}
