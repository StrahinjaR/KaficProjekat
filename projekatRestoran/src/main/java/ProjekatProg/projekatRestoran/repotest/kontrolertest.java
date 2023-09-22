package ProjekatProg.projekatRestoran.repotest;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

//public class kontrolertest implements RowMapper<entitet> {
   // @Override
  //  public entitet mapRow(ResultSet rs, int rowNum) throws SQLException {
   //     entitet entity = new entitet();
   //     entity.setId(rs.getLong("id"));
        //entity.setNazivProizvoda(rs.getString("name"));
      //  // Map other properties
    //    return entity;
  //  }

//}
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class kontrolertest {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public kontrolertest(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void testConnection() {
        try {
            String result = jdbcTemplate.queryForObject("SELECT 1", String.class);
            System.out.println("Database Connection Test Successful: " + result);
        } catch (Exception e) {
            System.err.println("Database Connection Test Failed: " + e.getMessage());
        }
    }
}
