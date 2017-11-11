package greeter.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import greeter.service.TranslatorService;
import greeter.service.TranslatorServiceImpl;
import greeter.response.Language;

public class TranslatorServiceImplTest
{

   private TranslatorService translatorService;

   @Before
   public void setUp() {
      translatorService = new TranslatorServiceImpl();
   }

   @Test
   public void shouldReturnAListOfLanguages() {
      // given
      List<Language> expected = new ArrayList<>();
      
      Language language = new Language();
      language.setName("Chinese");
      expected.add(language);

      language = new Language();
      language.setName("English");
      expected.add(language);

      // when
      List<Language> actual = translatorService.languages();

      // then
      assertEquals(actual.size(), 2);
      assertEquals(actual.get(0).getName(), "English");
      assertEquals(actual.get(1).getName(), "Chinese");
   }

}
