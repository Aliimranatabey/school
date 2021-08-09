package com.example.school.repository;

import com.example.school.entity.School;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "school")
public interface SchoolRepository extends JpaRepository<School, Long> {
    @Query("SELECT s from School s WHERE LOWER(s.name) LIKE LOWER(concat('%', concat(:name, concat('%')))) AND LOWER(s.code) LIKE LOWER(concat('%', concat(:code,concat('%'))))")
    Page<School> findBySchool(@Param("name") String name, @Param("code") String code, Pageable p);

    List<School> findByActiveTrue();
}
