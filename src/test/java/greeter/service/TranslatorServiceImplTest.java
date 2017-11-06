package greeter.service;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import greeter.service.TranslatorService;
import greeter.service.TranslatorServiceImpl;

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
      List<String> expected = new ArrayList<>();
      expected.add("Chinese");
      expected.add("English");

      // when
      List<String> actual = translatorService.languages();

      // then
      assertEquals(actual.size(), 2);
      assertTrue(actual.containsAll(expected));
   }

}
