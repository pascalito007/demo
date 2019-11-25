package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface TranscodeRepository extends CrudRepository<Transcode, Long> {
    public Transcode findByCode(String code);
}
