package guru.springframework.jokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringBootJokesAppApplication
{
    public static void main(final String[] args)
    {
        SpringApplication.run(SpringBootJokesAppApplication.class, args);
    }
}