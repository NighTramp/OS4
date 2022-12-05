package ru.gb.oseminar4.service;

import ru.gb.oseminar4.Model.Task;

import java.util.List;
import java.util.Map;

public interface ITaskService {
    void createTask(Map<String, String> data);
    void createLazyTask();
    void deleteTask(Integer id);
    List<Task> getAll();
    void clearAll();
}
