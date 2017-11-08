package greeter.service;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.Before;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class GreeterServiceImplTest
{
   @Mock
   private TranslatorServiceImpl translatorServiceImpl;

   @InjectMocks
   private GreeterServiceImpl greeterServiceImpl;

   @Before
   public void setUp() {
      MockitoAnnotations.initMocks(this);
   }
  
   @Test
   public void shouldInvokeTranslatorServiceToGetListOfLanguages() {
      // given
      // when
      greeterServiceImpl.getLanguages();
     
      // then
      verify(translatorServiceImpl, times(1)).languages();
   }

}
