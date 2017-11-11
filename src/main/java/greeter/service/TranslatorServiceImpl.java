package greeter.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

import greeter.response.Language;

@Component
public class TranslatorServiceImpl implements TranslatorService
{
   public List<Language> languages() {
      List<Language> languages = new ArrayList<>();
      
      Language language = new Language();
      language.setName("English");
      languages.add(language);
   
      language = new Language();
      language.setName("Chinese");
      languages.add(language);

      return languages;
   }

}
