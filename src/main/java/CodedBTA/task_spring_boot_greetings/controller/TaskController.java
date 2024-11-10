package CodedBTA.task_spring_boot_greetings.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @GetMapping("/greet")
    String greet(@RequestParam(name = "", required = false) String name){
        if (name == null){
            return "Hello World";
        }
        return "\"Hello, " + name + "!\".";
    }

    @PostMapping("/farewell")
    String farewell(@RequestBody JsonNode requestBody){
        return "\"Goodbye, " + requestBody.get("name") +"!\"";
    }
}
