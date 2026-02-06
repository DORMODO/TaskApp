package com.youssef.task.domain.dto;

import com.youssef.task.domain.entity.TaskPriority;
import com.youssef.task.domain.entity.TaskStatus;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public record UpdateTaskRequestDto(
        @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH)
        @Length(max = 255, message = ERROR_MESSAGE_TITLE_LENGTH)
        String title,
        @Length(max = 1000, message = ERROR_MESSAGE_DESCRIPTION_LENGTH)
        @Nullable
        String description,
        @FutureOrPresent(message = ERROR_MESSAGE_DUE_DATE_FUTURE)
        @Nullable
        LocalDate dueDate,
        @NotNull(message = ERROR_MESSAGE_PRIORITY)
        TaskPriority priority,
        @NotNull(message = ERROR_MESSAGE_STATUS)
        TaskStatus status
) {
    private static final String ERROR_MESSAGE_TITLE_LENGTH =
            "Title must not be blank and must not exceed 255 characters";
    private static final String ERROR_MESSAGE_DESCRIPTION_LENGTH =
            "Description must not exceed 1000 characters";
    private static final String ERROR_MESSAGE_DUE_DATE_FUTURE =
            "Due date must be in the present or future";
    private static final String ERROR_MESSAGE_PRIORITY =
            "Priority must not be null";
    private static final String ERROR_MESSAGE_STATUS =
            "Task status must be provided";
}
