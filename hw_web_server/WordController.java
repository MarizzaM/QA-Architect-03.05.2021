package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    @GetMapping("/counter")
    public String counter(@RequestParam(value = "word", defaultValue = "") String word) {
        return String.format("In the word %d symbols",  word.length());
    }

    @GetMapping("/concat")
    public String concat(@RequestParam(value = "word1", defaultValue = "") String word1,
                         @RequestParam(value = "word2", defaultValue = "") String word2) {
        return String.format("%s %s",  word1, word2);
    }

}
