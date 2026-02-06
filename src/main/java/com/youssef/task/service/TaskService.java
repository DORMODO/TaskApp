package com.youssef.task.service;

import com.youssef.task.domain.CreateTaskRequest;
import com.youssef.task.domain.UpdateTaskRequest;
import com.youssef.task.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {
    Task createTask(CreateTaskRequest request);

    List<Task> listTasks();

    Task updateTask(UUID taskId, UpdateTaskRequest request);

    void deleteTask(UUID taskId);
}
