package br.com.ialmeida.todolistspring.services;

import br.com.ialmeida.todolistspring.entities.Task;
import br.com.ialmeida.todolistspring.entities.enums.State;
import br.com.ialmeida.todolistspring.repositories.TaskRepository;
import br.com.ialmeida.todolistspring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Task insert(Task task) {
        task.setState(State.CREATED);
        task.setCreatedDate(new Date());
        task.setModifiedDate(new Date());
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public Task update(Long id, Task task) {
        Task entity = taskRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        updateData(entity, task);
        return taskRepository.save(entity);
    }

    private void updateData(Task entity, Task task) {
        entity.setTitle(task.getTitle());
        entity.setDescription(task.getDescription());
        entity.setState(task.getState());
        entity.setModifiedDate(new Date());
    }

}
