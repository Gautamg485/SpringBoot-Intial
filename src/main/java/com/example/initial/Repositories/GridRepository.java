package com.example.initial.Repositories;

import java.util.Map;

public interface GridRepository {

    void save(String fileName, String grid);
    Map<String, String> findAll();
}
