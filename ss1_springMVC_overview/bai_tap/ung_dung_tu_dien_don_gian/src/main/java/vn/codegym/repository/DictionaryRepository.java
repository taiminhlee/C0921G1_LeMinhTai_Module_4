package vn.codegym.repository;


import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository{
   static Map<String,String> dictionary=new LinkedHashMap<>();



    static{
        dictionary.put("apple","táo");
        dictionary.put("house","nhà");
        dictionary.put("table","cái bàn");
        dictionary.put("chair","cái ghế");
        dictionary.put("hello","xin chào");
    }

    @Override
    public String search(String string) {
        for (String str:dictionary.keySet()) {
            if (string.equals(str)){
                return dictionary.get(str);

            }
        }
        return "Không tìm thấy";
    }
}

