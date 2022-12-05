package ru.gb.oseminar4.service;

import ru.gb.oseminar4.Model.Keys;
import ru.gb.oseminar4.Model.Priority;
import ru.gb.oseminar4.Model.Task;

import java.util.*;
import java.util.stream.Collectors;

public class TaskService implements ITaskService{
    private List<Task> taskList;

    public TaskService(List<Task> taskList) {
        this.taskList = taskList;
    }

    public TaskService() { this.taskList = new ArrayList<>(); }

    @Override
    public void createTask(Map<String, String> data) {
        String[] list = new String[4];
        data.forEach((key, value) -> {
            if ((Keys.PRIORITY.toString()).equals(key)) list[0] = value;
            else if ((Keys.DEADLINESS.toString()).equalsIgnoreCase(key)) {
                list[1] = value;
            } else if ((Keys.FULLNAME.toString()).equalsIgnoreCase(key)) {
                list[2] = value;
            } else if ((Keys.TASK.toString()).equalsIgnoreCase(key)) {
                list[3] = value;
            }
        });
        if (Arrays.stream(list).allMatch(Objects::nonNull)) {
            this.taskList.add(new Task(Priority.valueOf(list[0].toUpperCase()), list[1], list[2], list[3]));
        }
    }

    @Override
    public void createLazyTask() {
        this.taskList.add(new Task(Priority.LOW, "Now!", "Ivanov Ivan", "Do it!"));
    }

    @Override
    public void deleteTask(Integer id) {
        if (!this.taskList.isEmpty()) {
            Task task = taskList.stream()
                    .filter(element -> element.getId().equals(id))
                    .collect(Collectors.toList())
                    .get(0);
            this.taskList.remove(task);
        }
    }

    @Override
    public List<Task> getAll() {
        return this.taskList;
    }

    @Override
    public void clearAll() {
        this.taskList.clear();
    }
}
