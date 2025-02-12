package dev.fizlrock.waterwalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootApplication
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);

    ApplicationModules modules = ApplicationModules.of(App.class);
    modules.forEach(System.out::println);
    // new Documenter(modules).writeDocumentation();
  }
}
