package greeter.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreeterController {
   
   @RequestMapping("/hello")
   public String hello() {
      return "Hello there!";
   }
}
