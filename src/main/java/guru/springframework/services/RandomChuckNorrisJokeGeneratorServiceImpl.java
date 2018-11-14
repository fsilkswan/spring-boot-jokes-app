package guru.springframework.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomChuckNorrisJokeGeneratorServiceImpl
    implements RandomChuckNorrisJokeGeneratorService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomChuckNorrisJokeGeneratorServiceImpl()
    {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomChuckNorrisJoke()
    {
        final String randomQuote = chuckNorrisQuotes.getRandomQuote();

        return randomQuote;
    }
}