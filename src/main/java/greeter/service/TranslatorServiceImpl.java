package greeter.service;

import java.util.List;
import java.util.ArrayList;

public class TranslatorServiceImpl implements TranslatorService
{
   public List<String> languages() {
      List<String> languages = new ArrayList<>();
      
      languages.add("English");
      languages.add("Chinese");

      return languages;
   }
}
