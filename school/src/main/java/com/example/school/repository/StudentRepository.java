package com.example.school.repository;

import com.example.school.entity.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "student")
public interface StudentRepository extends JpaRepository<Student, Long> {

        @Query("SELECT s from Student s LEFT OUTER JOIN s.school sc WHERE LOWER(s.name) LIKE LOWER(concat('%', concat(:name,concat('%')))) AND "
                        + "LOWER(s.surname) LIKE LOWER(concat('%', concat(:surname,concat('%')))) AND "
                        + "LOWER(s.number) LIKE LOWER(concat('%', concat(:number,concat('%')))) AND "
                        + "(:school='' OR LOWER(sc.name) LIKE LOWER(concat('%', concat(:school,concat('%'))))) AND "
                        + "(s.gpa=:gpa OR :gpa is null) AND (s.age=:age OR :age is null)")
        List<Student> findAllSearch(@Param("name") String name, @Param("surname") String surname,
                        @Param("number") String number, @Param("age") Integer age, @Param("gpa") Double gpa,
                        @Param("school") String school);

}
