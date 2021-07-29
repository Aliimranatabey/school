package com.example.school.service;

import java.util.List;
import java.util.Optional;
import com.example.school.entity.School;
import com.example.school.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    public School findById(long id) {
        Optional<School> result = schoolRepository.findById(id);
        return result.get();
    }

    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<School> findAll() {
        return schoolRepository.findAll();
    }

    public void delete(long id) {
        schoolRepository.deleteById(id);
    }

    public School updateSchool(Long textId, School school) {
        schoolRepository.saveAndFlush(school);
        return saveSchool(school);
    }
}
