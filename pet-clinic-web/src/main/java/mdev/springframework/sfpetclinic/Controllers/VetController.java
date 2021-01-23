package mdev.springframework.sfpetclinic.Controllers;

import mdev.springframework.sfpetclinic.Services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class VetController {
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listViews(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "Vets/index";
    }
}
