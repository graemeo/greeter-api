package greeter.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import greeter.response.Language;

@Component
public class GreeterServiceImpl implements GreeterService
{
   @Autowired
   TranslatorServiceImpl translatorServiceImpl;

   public List<Language> getLanguages() {
      return translatorServiceImpl.languages();   
   }

}
