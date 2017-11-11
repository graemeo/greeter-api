package greeter.service;

import java.util.List;

import greeter.response.Language;

public interface TranslatorService
{
   List<Language> languages();
}
