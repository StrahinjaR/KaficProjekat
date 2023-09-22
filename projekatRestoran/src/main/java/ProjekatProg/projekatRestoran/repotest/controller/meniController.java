package ProjekatProg.projekatRestoran.repotest.controller;

import ProjekatProg.projekatRestoran.repotest.model.meniEntitet;
import ProjekatProg.projekatRestoran.repotest.repository.meniRepository; // Corrected class name
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class meniController { // Corrected class name

    private final meniRepository repository; // Corrected class name

    @Autowired
    public meniController(meniRepository repository) { // Corrected constructor
        this.repository = repository;
    }

    @GetMapping("/meni") // Specify the mapping URL
    public String printMeni(Model model) {

        List<meniEntitet> menuItems = repository.findAll();

        model.addAttribute("menuItems", menuItems);
        for (meniEntitet menuItem : menuItems) {
            System.out.println(menuItem);
        }
        System.out.println("Test");
         //Return the name of the HTML template
      return "/meni";
    }
}
