package edu.eci.ieti.tasks.data;

import edu.eci.ieti.tasks.enums.Status;

import java.util.Date;
import java.util.UUID;

public class Task {
    private final String name;
    private final String description;
    private final Status status;
    private final String assignedTo;
    private final Date dueDate;
    private final Date createdAt;
    private String id;

    public Task(String id, String name, String description, Status status, String assignedTo, Date dueDate, Date createdAt) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
