package br.com.ialmeida.todolistspring.config;

import br.com.ialmeida.todolistspring.entities.Task;
import br.com.ialmeida.todolistspring.entities.enums.State;
import br.com.ialmeida.todolistspring.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {

        Task t1 = new Task(null, "Title 1", "description 1", State.COMPLETED, new Date(), new Date());
        Task t2 = new Task(null, "Title 2", "description 2", State.CREATED, new Date(), new Date());

        taskRepository.saveAll(Arrays.asList(t1, t2));

    }

}
