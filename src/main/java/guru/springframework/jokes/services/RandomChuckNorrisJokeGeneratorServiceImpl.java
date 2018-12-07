package guru.springframework.jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomChuckNorrisJokeGeneratorServiceImpl
    implements RandomChuckNorrisJokeGeneratorService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomChuckNorrisJokeGeneratorServiceImpl(final ChuckNorrisQuotes chuckNorrisQuotes)
    {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomChuckNorrisJoke()
    {
        final String randomQuote = chuckNorrisQuotes.getRandomQuote();

        return randomQuote;
    }
}