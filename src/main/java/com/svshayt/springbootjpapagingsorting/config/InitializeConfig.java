package com.svshayt.springbootjpapagingsorting.config;

import com.svshayt.springbootjpapagingsorting.model.Tutorial;
import com.svshayt.springbootjpapagingsorting.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitializeConfig implements CommandLineRunner {

    @Autowired
    TutorialRepository tutorialRepository;

    @Override
    public void run(String... args) throws Exception {
        Tutorial tutorial = Tutorial.builder()
            .title("Spring Boot Tut 1")
            .description("Description Tut 1")
            .published(false)
            .build();
        tutorialRepository.save(tutorial);
        tutorial = Tutorial.builder()
            .title("Spring Boot Tut#2")
            .description("Description Tut#2")
            .published(true)
            .build();
        tutorialRepository.save(tutorial);
        tutorial = Tutorial.builder()
            .title("Spring Boot Tut#3")
            .description("Description Tut#3")
            .published(false)
            .build();
        tutorialRepository.save(tutorial);
        tutorial = Tutorial.builder()
            .title("Spring Boot Tut#4")
            .description("Description Tut#4")
            .published(true)
            .build();
        tutorialRepository.save(tutorial);
        tutorial = Tutorial.builder()
            .title("Spring Boot Tut#5")
            .description("Description Tut#5")
            .published(false)
            .build();
        tutorialRepository.save(tutorial);
        tutorial = Tutorial.builder()
            .title("Spring Boot Tut#6")
            .description("Description Tut#6")
            .published(true)
            .build();
        tutorialRepository.save(tutorial);
    }
}
