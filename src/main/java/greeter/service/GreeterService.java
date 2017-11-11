package greeter.service;

import java.util.List;
import org.springframework.stereotype.Service;

import greeter.response.Language;

@Service
public interface GreeterService
{
   List<Language> getLanguages();
}
