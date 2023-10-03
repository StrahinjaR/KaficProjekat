package ProjekatProg.projekatRestoran.repotest.controller;

import ProjekatProg.projekatRestoran.repotest.model.meniEntitet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class meniController {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @GetMapping("/fetch-data")
    @CrossOrigin
    public Map<String, List<meniEntitet>> fetchData() {
        String sql = "SELECT * FROM MENI";
        List<meniEntitet> meniEntitets = jdbcTemplate.query(
                sql,
                (resultSet, rowNum) -> {
                    meniEntitet meniEntitet = new meniEntitet();
                    meniEntitet.setId(resultSet.getLong("id"));
                    meniEntitet.setNazivProizvoda(resultSet.getString("naziv_proizvoda"));
                    meniEntitet.setCenaProizvoda(resultSet.getInt("cena_proizvoda"));
                    return meniEntitet;
                }
        );

        Map<String, List<meniEntitet>> responseMap = new HashMap<>();
        responseMap.put("meni", meniEntitets);
        return responseMap;
    }
}