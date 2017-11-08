package greeter.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class GreeterServiceImpl implements GreeterService
{
   @Autowired
   TranslatorServiceImpl translatorServiceImpl;

   public List<String> getLanguages() {
      return translatorServiceImpl.languages();   
   }

}
