package dev.fizlrock.waterwalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootApplication
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);

    ApplicationModules modules = ApplicationModules.of(App.class);
    new Documenter(modules).writeDocumentation();
  }
}
