package Entities;

import javax.persistence.*;

@Entity
@Table(name = "riviste")
@DiscriminatorValue("ISBN")
public class Rivista extends Catalogo {

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;

    public Rivista(String titolo, int annoPubblicazione, int pagine, Periodicita periodicita) {
        super(titolo, annoPubblicazione, pagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString() {
        return super.toString() +
                "periodicita=" + periodicita +
                '}';
    }
}
