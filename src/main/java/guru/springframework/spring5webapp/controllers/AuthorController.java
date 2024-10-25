package guru.springframework.spring5webapp.controllers;


import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;


    private final GreetingService greetingService;

    public AuthorController(AuthorRepository authorRepository, @Qualifier("i18nService") GreetingService greetingService) {
        this.authorRepository = authorRepository;
        this.greetingService = greetingService;
    }

    // Add a new method to return a list of authors
    @RequestMapping("/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }

    public String getAuthors() {
        return greetingService.sayGreeting();
    }

}
