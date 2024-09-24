package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("welcome")
public class WelcomeController {

    @GetMapping("/greeting")
    public String getGreeting(){
        return "Hello beautiful";
    }

}
