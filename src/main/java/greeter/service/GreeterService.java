package greeter.service;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface GreeterService
{
   List<String> getLanguages();
}
