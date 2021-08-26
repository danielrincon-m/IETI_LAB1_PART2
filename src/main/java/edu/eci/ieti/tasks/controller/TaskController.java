package edu.eci.ieti.tasks.controller;

import edu.eci.ieti.tasks.data.Task;
import edu.eci.ieti.tasks.dto.TaskDto;
import edu.eci.ieti.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {
    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto) {
        Task newTask = taskService.create(new Task(taskDto));
        return new ResponseEntity<>(newTask, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable String id) {
        Task task = taskService.findById(id);
        return new ResponseEntity<>(task, HttpStatus.FOUND);
    }

    @GetMapping
    public ResponseEntity<List<Task>> allTasks() {
        List<Task> tasks = taskService.all();
        return new ResponseEntity<>(tasks, HttpStatus.FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        boolean result = taskService.deleteById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id) {
        Task newTask = taskService.update(new Task(taskDto), id);
        return new ResponseEntity<>(newTask, HttpStatus.ACCEPTED);
    }
}
