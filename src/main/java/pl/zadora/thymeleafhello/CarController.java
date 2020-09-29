package pl.zadora.thymeleafhello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {

    @GetMapping("/car")
    public String getCar(Model model) {
        model.addAttribute("name", "Piorun");
        Car car = new Car("BMW", "i8");
        model.addAttribute("car", car);
        return "car";
    }
}
