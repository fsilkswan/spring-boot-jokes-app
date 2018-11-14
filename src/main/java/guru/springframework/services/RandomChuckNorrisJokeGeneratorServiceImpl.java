package guru.springframework.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomChuckNorrisJokeGeneratorServiceImpl
    implements RandomChuckNorrisJokeGeneratorService
{
    @Override
    public String getRandomChuckNorrisJoke()
    {
        final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
        final String randomQuote = quotes.getRandomQuote();

        return randomQuote;
    }
}