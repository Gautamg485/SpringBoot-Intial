package com.example.initial.cli;

import com.example.initial.Repositories.GridRepository;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;

@ShellComponent
public class Migration {

    private GridRepository gridRepository;

    public Migration(GridRepository gridRepository) {
        this.gridRepository = gridRepository;
    }

    @ShellMethod(value = "Migration")
    public String migration(String filePath) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        File dir = new File(filePath);
        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".json");
            }
        });
        for (File file : files) {
            System.out.println("FileName");
            System.out.println(file.getName());
            FileReader reader = new FileReader(file);
            Object obj = parser.parse(reader);
            JSONObject json = (JSONObject) obj;
            gridRepository.save(file.getName(), json.toString());
        }
        return "Done";
    }
}
