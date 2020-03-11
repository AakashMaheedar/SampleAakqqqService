package com.freshworks.com.resources;

import com.freshworks.com.domain.SampleAakqqq;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SampleAakqqqController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public SampleAakqqq greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new SampleAakqqq(counter.incrementAndGet(),
                String.format(template, name));
    }
}
