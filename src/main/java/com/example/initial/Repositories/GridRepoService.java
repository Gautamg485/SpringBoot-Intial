package com.example.initial.Repositories;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class GridRepoService implements GridRepository {

    private RedisTemplate<String, String> redisTemplate;
    private HashOperations hashOperations;

    public GridRepoService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void save(String fileName, String grid) {
        hashOperations.put(fileName, grid, grid);
    }

    @Override
    public Map<String, String> findAll() {
        return hashOperations.entries("Grid");
    }
}
