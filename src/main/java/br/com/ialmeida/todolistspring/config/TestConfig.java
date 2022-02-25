package br.com.ialmeida.todolistspring.config;

import br.com.ialmeida.todolistspring.entities.Task;
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

    @Override
    public void run(String... args) throws Exception {

        Task t1 = new Task(null, "Title 1", "description 1");
        Task t2 = new Task(null, "Title 2", "description 2");

        taskRepository.saveAll(Arrays.asList(t1, t2));

    }

}
