package ProjekatProg.projekatRestoran.repotest.controller;

import ProjekatProg.projekatRestoran.repotest.model.rezervacijeEntitet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ProjekatProg.projekatRestoran.repotest.repository.rezervacijeRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class rezervacijeController {

    private final rezervacijeRepository repository;
    @Autowired
    public rezervacijeController(rezervacijeRepository entity)
    {
        this.repository=entity;
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute rezervacijeEntitet entity) {
        repository.save(entity);
        System.out.println("NIJE ISPISALO NISTA AL JE VALJDA PROBALO");

        return "redirect:/uspesna-rezervacija.html"; // Redirect to a success page

    }
}

