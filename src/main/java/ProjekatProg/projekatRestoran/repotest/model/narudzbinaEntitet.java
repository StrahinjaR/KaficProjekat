package ProjekatProg.projekatRestoran.repotest.model;

import jakarta.persistence.Id;

public class narudzbinaEntitet {
    @Id
    private int id;
    private String naruceno;
    private int ukupnaCena;

    public narudzbinaEntitet() {}

    public narudzbinaEntitet(int id, String naruceno, int ukupnaCena) {
        this.id = id;
        this.naruceno = naruceno;
        this.ukupnaCena = ukupnaCena;
    }

    public int getId() {
        return id;
    }

    public String getNaruceno() {
        return naruceno;
    }

    public int getUkupnaCena() {
        return ukupnaCena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNaruceno(String naruceno) {
        this.naruceno = naruceno;
    }

    public void setUkupnaCena(int ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }
}
