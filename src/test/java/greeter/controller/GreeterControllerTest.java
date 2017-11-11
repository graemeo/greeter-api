package greeter.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import greeter.service.GreeterServiceImpl;
import greeter.response.Language;

@RunWith(SpringRunner.class)
@WebMvcTest(GreeterController.class)
public class GreeterControllerTest {
 
   @Autowired
   private MockMvc mockMvc;

   @MockBean
   private GreeterServiceImpl greeterServiceImpl;

   @Test
   public void shouldReturnSuccessfulResponse() throws Exception {
      // given
      // when
      // then
      mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
         .andExpect(status().isOk())
         .andExpect(content().string(equalTo("Hello there!")));
   }

   @Ignore
   @Test
   public void shouldReturnSuccessfulResponseWhenGettingLanguages() throws Exception {
      // given
      List<Language> languages = new ArrayList<>();

      Language language = new Language();
      language.setName("Spanish");
      languages.add(language);

      language = new Language();
      language.setName("Japanese");
      languages.add(language);

      // when
      when(greeterServiceImpl.getLanguages()).thenReturn(languages);

      // then
      mockMvc.perform(MockMvcRequestBuilders.get("/languages"))
         .andDo(print())
         .andExpect(status().isOk())
         .andExpect(content().string(equalTo("")));
   }

}
