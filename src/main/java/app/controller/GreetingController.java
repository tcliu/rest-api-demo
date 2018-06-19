package app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Api(value = "greeting", description = "Rest API for greeting", tags = "Greeting API")
public class GreetingController {

    @GetMapping("/hello")
    @ApiOperation(value = "Display greeting message", response = HttpEntity.class)
    public HttpEntity<String> hello() {
        return ResponseEntity.ok("Hello world!");
    }

    @GetMapping("/hello/{name}")
    @ApiOperation(value = "Display greeting message with name", response = HttpEntity.class)
    public HttpEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok(String.format("Hello, %s!", name));
    }

}
