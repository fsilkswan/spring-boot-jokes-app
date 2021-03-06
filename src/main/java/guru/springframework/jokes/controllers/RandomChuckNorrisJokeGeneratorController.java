package guru.springframework.jokes.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.jokes.services.RandomChuckNorrisJokeGeneratorService;

@Controller
public class RandomChuckNorrisJokeGeneratorController
{
    private final RandomChuckNorrisJokeGeneratorService randomChuckNorrisJokeGeneratorService;

    @Autowired
    public RandomChuckNorrisJokeGeneratorController(final RandomChuckNorrisJokeGeneratorService randomChuckNorrisJokeGeneratorService)
    {
        this.randomChuckNorrisJokeGeneratorService = randomChuckNorrisJokeGeneratorService;
    }

    @RequestMapping(path = { "", "/" }, method = GET)
    String getRandomChuckNorrisJoke(final Model model)
    {
        final String randomChuckNorrisJoke = randomChuckNorrisJokeGeneratorService.getRandomChuckNorrisJoke();
        model.addAttribute("chuckNorrisJoke", randomChuckNorrisJoke);

        return "chucknorris";
    }
}