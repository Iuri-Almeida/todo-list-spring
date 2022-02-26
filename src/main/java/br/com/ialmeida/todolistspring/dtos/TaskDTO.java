package br.com.ialmeida.todolistspring.dtos;

import br.com.ialmeida.todolistspring.entities.Task;

import java.io.Serializable;

public class TaskDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String description;

    public TaskDTO() {
    }

    public TaskDTO(Task task) {
        id = task.getId();
        title = task.getTitle();
        description = task.getDescription();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
