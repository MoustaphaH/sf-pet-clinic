package mdev.springframework.sfpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {
    @RequestMapping({"Vets", "Vets/index", "Vets/index.html"})
    public String listViews(){
        return "Vets/index";
    }
}
