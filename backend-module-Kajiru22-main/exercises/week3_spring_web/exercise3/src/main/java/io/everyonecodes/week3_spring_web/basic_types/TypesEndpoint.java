package io.everyonecodes.week3_spring_web.basic_types;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/types")

public class TypesEndpoint {


    @GetMapping("/text")
    String getText() {
        return "Types";
    }

    @GetMapping("/choice")
    boolean getChoice() {
        return false;
    }

    @GetMapping("/number")
    int getNumber() {
        return 25920;
    }











}