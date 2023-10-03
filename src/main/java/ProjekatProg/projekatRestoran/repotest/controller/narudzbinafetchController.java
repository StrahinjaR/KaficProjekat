package ProjekatProg.projekatRestoran.repotest.controller;

import ProjekatProg.projekatRestoran.repotest.model.narudzbinaEntitet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class narudzbinafetchController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/narudzbine")
    @CrossOrigin
    public Map<String, List<narudzbinaEntitet>> fetchData() {
        String sql = "SELECT * FROM NARUDZBINE";
        List<narudzbinaEntitet> narudzbinaEntitets = jdbcTemplate.query(
                sql,
                (resultSet, rowNum) -> {
                    narudzbinaEntitet narudzbinaEntitet = new narudzbinaEntitet();
                    narudzbinaEntitet.setId(resultSet.getInt("id"));
                    narudzbinaEntitet.setNaruceno(resultSet.getString("naruceno"));
                    narudzbinaEntitet.setUkupnaCena(resultSet.getInt("ukupna_cena"));
                    return narudzbinaEntitet;
                }
        );

        Map<String, List<narudzbinaEntitet>> responseMap = new HashMap<>();
        responseMap.put("meni", narudzbinaEntitets);
        return responseMap;
    }
}