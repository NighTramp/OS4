package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Task;

import java.util.List;
import java.util.Map;

public interface ITaskService {
    void createTask(Map<String, String> data);
    void createLazyTask();
    void deleteTask(Integer id);
    List<Task> getAll();
    void clearAll();
}
