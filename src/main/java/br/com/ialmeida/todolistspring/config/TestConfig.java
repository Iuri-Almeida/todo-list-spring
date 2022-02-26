package br.com.ialmeida.todolistspring.config;

import br.com.ialmeida.todolistspring.entities.Comment;
import br.com.ialmeida.todolistspring.entities.Task;
import br.com.ialmeida.todolistspring.repositories.CommentRepository;
import br.com.ialmeida.todolistspring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public void run(String... args) throws Exception {

        Task t1 = new Task(null, "Title 1", "description 1");
        Task t2 = new Task(null, "Title 2", "description 2");
        taskRepository.saveAll(Arrays.asList(t1, t2));

        Comment c1 = new Comment(null, "Text 1", t1);
        Comment c2 = new Comment(null, "Text 2", t1);
        Comment c3 = new Comment(null, "Text 3", t2);
        commentRepository.saveAll(Arrays.asList(c1, c2, c3));

        t1.getComments().add(c1);
        t1.getComments().add(c2);
        t2.getComments().add(c3);
        taskRepository.saveAll(Arrays.asList(t1, t2));

    }

}
