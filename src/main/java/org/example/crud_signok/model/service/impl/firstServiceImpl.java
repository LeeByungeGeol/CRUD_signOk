package org.example.crud_signok.model.service.impl;

import org.example.crud_signok.model.service.firstService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class firstServiceImpl implements firstService {
    @Override
    public Map<String, String> getFirstData(){

        Map<String, String> firstData = new HashMap<>();

        firstData.put("label1", "check1");
        firstData.put("label2", "check2");
        firstData.put("label3", "check3");

        return  firstData;
    }
}
