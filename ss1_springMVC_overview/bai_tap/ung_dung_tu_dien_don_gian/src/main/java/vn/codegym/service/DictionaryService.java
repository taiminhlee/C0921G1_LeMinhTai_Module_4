package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.repository.DictionaryRepository;
import vn.codegym.repository.IDictionaryRepository;

@Service
public class DictionaryService implements IDictionaryService {

    @Autowired
   private DictionaryRepository dictionaryRepository;

    @Override
    public String search(String string) {
        return dictionaryRepository.search(string);
    }
}
