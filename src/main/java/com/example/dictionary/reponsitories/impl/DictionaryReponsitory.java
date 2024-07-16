package com.example.dictionary.reponsitories.impl;

import com.example.dictionary.reponsitories.IDictionaryReponsitory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DictionaryReponsitory implements IDictionaryReponsitory {
    private static HashMap<String,String> words = new HashMap<>();

    static {
        words.put("eat","ăn");
        words.put("water","nước");
        words.put("juice","nước ép");
    }

    @Override
    public String findWord(String eng) {
        for(HashMap.Entry<String,String> word: words.entrySet()){
            if(word.getKey().equals(eng)){
                return word.getValue();
            }
        }
        return null;
    }
}
