package io.github.tttol.newrelicsample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("sample")
public class SampleController {
    @GetMapping
    public String sample() {
        log.info("sample accessed!");
        return "sample";
    }
}
