package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.service.Service;
import web.config.service.ServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {
    Service service = new ServiceImpl();

    @GetMapping("/")
    public String getAllCars(Model model){
        model.addAttribute("cars", service.getAllCars());
        return "/cars";
    }

    @GetMapping("")
    public String getCars(@RequestParam(value = "count") int count, Model model){
        model.addAttribute("cars", service.getCars(count));
        return "/cars";
    }
}
