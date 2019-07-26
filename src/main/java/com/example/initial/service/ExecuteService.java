package com.example.initial.service;

import com.example.initial.Repositories.GridRepository;
import com.example.initial.request.RequestInput;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Map;

@Service
public class ExecuteService {

    private GridRepository gridRepository;

    public ExecuteService(GridRepository gridRepository) {
        this.gridRepository = gridRepository;
    }

    public String executeOffers(RequestInput request) {
        return "data";
    }

    public Map<String, String> migrateJson() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        File dir = new File("/home/cm/gowtham/cmol-rule-engine-v2.0-json/");
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".json");
            }
        });
        for (File file : files) {
            System.out.println("namename");
            System.out.println(file.getName());
            FileReader reader = new FileReader(file);
            Object obj = parser.parse(reader);
            JSONObject json = (JSONObject) obj;
            gridRepository.save(file.getName(), json.toString());
        }
        return gridRepository.findAll();
    }
}
