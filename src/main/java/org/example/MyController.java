package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class MyController {

    private static Map<String, String> usersFromDB = Map.of("name1", "Arja", "name2", "John");


    @RequestMapping("/greet/{param1}")
    public ModelAndView greet(@PathVariable("param1") String param, @RequestParam String mode){
        System.out.println("request caught!");
        ModelAndView modelAndView = new ModelAndView("greet", usersFromDB);
        String modeMessage = "happy".equals(mode) ? "we are happy today" : "we are sad today";
        modelAndView.addObject("modeMessage", modeMessage);
        modelAndView.addObject("nameToGreet", param);
        System.out.println(modelAndView.getModel());
        return modelAndView;
    }

    @RequestMapping("/welcome")
    public String welcome(){
        System.out.println("request welcome caught!");
        return "welcome";
    }


    public MyController() {
        System.out.println("Controller created!");
    }
}

