package edu.eci.ieti.tasks.dto;

import edu.eci.ieti.tasks.enums.Status;

import java.util.Date;

public class TaskDto {
    private final String name;
    private final String description;
    private final Status status;
    private final String assignedTo;
    private final Date dueDate;
    private final Date createdAt;

    public TaskDto(String name, String description, Status status, String assignedTo, Date dueDate, Date createdAt) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }
}
