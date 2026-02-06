package com.youssef.task.domain;

import com.youssef.task.domain.entity.TaskPriority;
import com.youssef.task.domain.entity.TaskStatus;

import java.time.LocalDate;

public record UpdateTaskRequest(
        String title,
        String description,
        LocalDate dueDate,
        TaskStatus status,
        TaskPriority priority
) {
}
