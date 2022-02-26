package br.com.ialmeida.todolistspring.resources;

import br.com.ialmeida.todolistspring.entities.Comment;
import br.com.ialmeida.todolistspring.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/comments")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @GetMapping
    public ResponseEntity<List<Comment>> findAll() {
        List<Comment> comments = commentService.findAll();
        return ResponseEntity.ok().body(comments);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Comment> findById(@PathVariable Long id) {
        Comment comment = commentService.findById(id);
        return ResponseEntity.ok().body(comment);
    }

}
