package resttest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/restTest")
    @ResponseBody
    public String index() {
        return "\"I love travel port and need a job\"";
    }

}