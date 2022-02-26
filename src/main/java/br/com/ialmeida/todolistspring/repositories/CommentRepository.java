package br.com.ialmeida.todolistspring.repositories;

import br.com.ialmeida.todolistspring.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
