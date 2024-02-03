package com.SoftwareEngineering002.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentNameController {

    @GetMapping("/v1/student/name")
    public String getStudentName(@RequestParam(name = "formal", defaultValue = "false") boolean isFormal) {
        if (isFormal) {
            return "Maria Borovikova";
        } else {
            return "Maria";
        }
    }
}
