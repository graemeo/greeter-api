package greeter.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreeterControllerTest {
 
   @Autowired
   private MockMvc mockMvc;
  
   @Test
   public void shouldReturnSuccessfulResponse() throws Exception {
      // given
      // when
      // then
      mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
         .andExpect(status().isOk())
         .andExpect(content().string(equalTo("Hello there!")));
   }

}
