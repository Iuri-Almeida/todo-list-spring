package br.com.ialmeida.todolistspring.services;

import br.com.ialmeida.todolistspring.entities.Comment;
import br.com.ialmeida.todolistspring.repositories.CommentRepository;
import br.com.ialmeida.todolistspring.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    public Comment findById(Long id) {
        Optional<Comment> obj = commentRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

}
