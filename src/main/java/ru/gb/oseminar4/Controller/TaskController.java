package ru.gb.oseminar4.Controller;


import ru.gb.oseminar4.service.TaskService;
import ru.gb.oseminar4.view.ViewConsole;

import java.util.Map;

public class TaskController {

    private final ViewConsole viewConsoe = new ViewConsole();
    private final TaskService taskService = new TaskService();

    public void createTask(Map<String, String> data) { taskService.createTask(data);}
    public void createLazyTask() { taskService.createLazyTask(); }

    public void viewTasks() { viewConsoe.viewList(taskService.getAll()); }

    public void deleteTasks(Integer id) { taskService.deleteTask(id); }

}
