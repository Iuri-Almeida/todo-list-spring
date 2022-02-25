package br.com.ialmeida.todolistspring.services;

import br.com.ialmeida.todolistspring.entities.Task;
import br.com.ialmeida.todolistspring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Long id) {
        Optional<Task> obj = taskRepository.findById(id);
        return obj.orElse(null);
    }

}
