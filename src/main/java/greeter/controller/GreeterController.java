package greeter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import greeter.service.GreeterServiceImpl;
import greeter.response.Language;

@RestController
public class GreeterController {
   
   @Autowired
   private GreeterServiceImpl greeterServiceImpl;

   @RequestMapping("/hello")
   public ResponseEntity<String> hello() {
      System.out.println(greeterServiceImpl);
      
      return new ResponseEntity<String>("Hello there!", HttpStatus.OK);
   }

   @RequestMapping("/languages")
   public List<Language> getLanguages() {
      return greeterServiceImpl.getLanguages();
   }

}
