package wiledw.MovieMeter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public  String home(){
        return "Hello, home! You are not logged in.";

    }

    @GetMapping("/secured")
    public  String secured(){
        return "Hello, secured! You are logged in.";

    }
}
