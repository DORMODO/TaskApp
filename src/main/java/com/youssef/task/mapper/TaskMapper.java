package com.youssef.task.mapper;

import com.youssef.task.domain.CreateTaskRequest;
import com.youssef.task.domain.UpdateTaskRequest;
import com.youssef.task.domain.dto.CreateTaskRequestDto;
import com.youssef.task.domain.dto.TaskDto;
import com.youssef.task.domain.dto.UpdateTaskRequestDto;
import com.youssef.task.domain.entity.Task;

public interface TaskMapper {
    CreateTaskRequest fromDto(CreateTaskRequestDto dto);

    UpdateTaskRequest fromDto(UpdateTaskRequestDto dto);

    TaskDto toDto(Task task);
}
