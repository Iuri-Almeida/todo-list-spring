package br.com.ialmeida.todolistspring.repositories;

import br.com.ialmeida.todolistspring.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
