package Entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prestiti")
public class Prestito {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Catalogo elementoPrestato;
    @ManyToOne(cascade = CascadeType.ALL)
    private Utente utente;
    private LocalDate inizioPrestito;
    private LocalDate finePrevistaPrestito;
    private LocalDate finePrestito;

    public Prestito(Utente utente, Catalogo elementoPrestato, LocalDate inizioPrestito,
                    LocalDate finePrevistaPrestito, LocalDate finePrestito) {
        this.utente = utente;
        this.elementoPrestato = elementoPrestato;
        this.inizioPrestito = inizioPrestito;
        this.finePrevistaPrestito = inizioPrestito.plusDays(30);
        this.finePrestito = finePrestito;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Catalogo getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(Catalogo elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public LocalDate getInizioPrestito() {
        return inizioPrestito;
    }

    public void setInizioPrestito(LocalDate inizioPrestito) {
        this.inizioPrestito = inizioPrestito;
    }

    public LocalDate getFinePrevistaPrestito() {
        return finePrevistaPrestito;
    }

    public void setFinePrevistaPrestito(LocalDate finePrevistaPrestito) {
        this.finePrevistaPrestito = finePrevistaPrestito;
    }

    public LocalDate getFinePrestito() {
        return finePrestito;
    }

    public void setFinePrestito(LocalDate finePrestito) {
        this.finePrestito = finePrestito;
    }
}
