package guru.springframework.spring5webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetingServiceImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
