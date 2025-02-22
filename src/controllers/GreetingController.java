package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class GreetingController {
//    @GetMapping("/greeting")
//    public ModelAndView greeting(){
//        ModelAndView modelAndView = new ModelAndView("index");
//        return modelAndView ;
//    }

    @GetMapping("/{name}")
    public ModelAndView greeting2(@PathVariable String name){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
