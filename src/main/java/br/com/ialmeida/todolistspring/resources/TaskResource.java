package br.com.ialmeida.todolistspring.resources;

import br.com.ialmeida.todolistspring.entities.Task;
import br.com.ialmeida.todolistspring.entities.enums.State;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

    @GetMapping
    public ResponseEntity<Task> findAll() {
        Task task = new Task(1L, "Title", "description", State.COMPLETED, new Date(), new Date());
        return ResponseEntity.ok().body(task);
    }

}
