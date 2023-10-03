package ProjekatProg.projekatRestoran.repotest.model;

import org.springframework.data.annotation.Id;

public class meniEntitet {
    @Id
    private Long id;
    private String nazivProizvoda;
    private int cenaProizvoda;



    public meniEntitet() {

    }

    public meniEntitet(Long id, String nazivProizvoda, int cenaProizvoda) {
        this.id = id;
        this.nazivProizvoda = nazivProizvoda;
        this.cenaProizvoda = cenaProizvoda;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public int getCenaProizvoda() {
        return cenaProizvoda;
    }

    public void setCenaProizvoda(int cenaProizvoda) {
        this.cenaProizvoda = cenaProizvoda;
    }
}
