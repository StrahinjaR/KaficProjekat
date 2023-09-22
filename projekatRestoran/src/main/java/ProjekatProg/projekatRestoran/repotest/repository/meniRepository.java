package ProjekatProg.projekatRestoran.repotest.repository;

import ProjekatProg.projekatRestoran.repotest.model.meniEntitet;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class meniRepository {

    private final JdbcTemplate jdbcTemplate;

    public meniRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<meniEntitet> findAll() {
        String sql = "SELECT * FROM MENI";
        return jdbcTemplate.query(sql, (resultSet, rowNum) -> {
            meniEntitet menu = new meniEntitet();
            menu.setId(resultSet.getLong("id"));
            menu.setNazivProizvoda(resultSet.getString("naziv_proizvoda"));
            menu.setCenaProizvoda(resultSet.getInt("cena_proizvoda"));

            return menu;
        });
    }
}

