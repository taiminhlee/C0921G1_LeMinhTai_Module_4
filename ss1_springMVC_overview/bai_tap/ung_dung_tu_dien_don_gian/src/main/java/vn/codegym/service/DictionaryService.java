package vn.codegym.service;

import vn.codegym.repository.DictionaryRepository;
import vn.codegym.repository.IDictionaryRepository;


public class DictionaryService implements IDictionaryService {
    IDictionaryRepository dictionaryRepository = new DictionaryRepository();

    @Override
    public String search(String string) {
        return dictionaryRepository.search(string);
    }
}
