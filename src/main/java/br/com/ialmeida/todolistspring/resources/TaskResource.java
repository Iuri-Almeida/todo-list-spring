package br.com.ialmeida.todolistspring.resources;

import br.com.ialmeida.todolistspring.entities.Task;
import br.com.ialmeida.todolistspring.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> findAll() {
        List<Task> tasks = taskService.findAll();
        return ResponseEntity.ok().body(tasks);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> findById(@PathVariable Long id) {
        Task task = taskService.findById(id);
        return ResponseEntity.ok().body(task);
    }

}
