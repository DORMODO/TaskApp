package com.youssef.task.exception;

import lombok.Getter;

import java.util.UUID;

@Getter
public class TaskNotFoundException extends RuntimeException {
    private final UUID id;

    public TaskNotFoundException(UUID id) {
        super(String.format("Task with ID '%s' not found.", id));
        this.id = id;
    }
}
