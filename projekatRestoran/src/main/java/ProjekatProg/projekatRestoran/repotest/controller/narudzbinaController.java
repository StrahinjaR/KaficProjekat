package ProjekatProg.projekatRestoran.repotest.controller;

import ProjekatProg.projekatRestoran.repotest.model.narudzbinaEntitet;
import ProjekatProg.projekatRestoran.repotest.model.rezervacijeEntitet;
import ProjekatProg.projekatRestoran.repotest.repository.narudzbinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class narudzbinaController {
    private final narudzbinaRepository repository;
    @Autowired
    public narudzbinaController(narudzbinaRepository entity)
    {
        this.repository=entity;
    }

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute narudzbinaEntitet entity) {
        repository.save(entity);
        System.out.println("NIJE ISPISALO NISTA AL JE VALJDA PROBALO");

        return "redirect:/uspesna-rezervacija.html"; // Redirect to a success page

    }
}
