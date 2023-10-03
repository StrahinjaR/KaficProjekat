package ProjekatProg.projekatRestoran.repotest.repository;

import ProjekatProg.projekatRestoran.repotest.model.rezervacijeEntitet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class rezervacijeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(rezervacijeEntitet rezervacije) {
        String sql = "INSERT INTO REZERVACIJE (ime, telefon, datum, vreme, broj_gostiju) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, rezervacije.getIme(), rezervacije.getTelefon(), rezervacije.getDatum(),rezervacije.getVreme(),rezervacije.getBroj_gostiju());
    }
}
