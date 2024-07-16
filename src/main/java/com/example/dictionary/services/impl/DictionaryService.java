package com.example.dictionary.services.impl;

import com.example.dictionary.reponsitories.IDictionaryReponsitory;
import com.example.dictionary.reponsitories.impl.DictionaryReponsitory;
import com.example.dictionary.services.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    private IDictionaryReponsitory dictionaryReponsitory = new DictionaryReponsitory();
    @Override
    public String findWord(String eng) {
        return dictionaryReponsitory.findWord(eng);
    }
}
