// package com.example.school.controller;

// import java.util.List;
// import com.example.school.entity.School;
// import com.example.school.service.SchoolService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class SchoolController {

// @Autowired
// private SchoolService schoolService;

// @GetMapping("")
// String first() {
// return "Hello World";
// }

// @GetMapping("/schools")
// List<School> all() {
// return schoolService.findAll();
// }

// @PostMapping("/schools")
// void addSchool(@RequestBody School school) {
// schoolService.saveSchool(school);
// }

// @GetMapping("/schools/{id}")
// School readSchool(@PathVariable Long id) {
// return schoolService.findById(id);
// }

// @DeleteMapping("/schools")
// public void deleteSchool(@RequestParam("id") Long id) {
// schoolService.delete(id);
// }

// @PutMapping(value = "/schools/{textId}")
// public School updateSchool(@PathVariable Long textId, @RequestBody School
// school) {
// return schoolService.updateSchool(textId, school);
// }
// }
