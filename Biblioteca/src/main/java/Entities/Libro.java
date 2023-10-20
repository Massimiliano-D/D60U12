package Entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "libri")
//@DiscriminatorValue("ISBN")
public class Libro extends Catalogo {
    private String autore;
    private String genere;


    public Libro(String titolo, int annoPubblicazione, int pagine, String autore, String genere) {
        super(titolo, annoPubblicazione, pagine);
        this.autore = autore;
        this.genere = genere;

    }

    public Libro() {


    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

}
