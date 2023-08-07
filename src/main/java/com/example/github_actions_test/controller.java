package com.example.github_actions_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    private final Dao dao;

    public controller(Dao dao) {
        this.dao = dao;
    }

    @GetMapping("/")
    public String home() {

        dao.test(3, "c");

        return "배포 완료!!";
    }
}
