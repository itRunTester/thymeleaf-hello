package pl.zadora.thymeleafhello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String get(Model model) {
        Car car = new Car("BMW", "i8");
        model.addAttribute("name", "Piorun");
        model.addAttribute("car", car);
        return "hello";
    }
}
