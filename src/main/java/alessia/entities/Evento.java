package alessia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Eventi")
public class Evento {
    @Id
    @GeneratedValue
    private long id;
    private String titolo;
    @Column(name = "data_evento")
    private int dataEvento;
    private String descrizione;
    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    eventType tipoEvento;
    @Column (name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecpianti;

// CONSTRUCTORS

    public Evento(){}

    public Evento(String titolo, int dataEvento, String descrizione, eventType tipoEvento, int numeroMassimoPartecpianti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecpianti = numeroMassimoPartecpianti;
    }

// GETTERS & SETTERS


    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(int dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public eventType getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(eventType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecpianti() {
        return numeroMassimoPartecpianti;
    }

    public void setNumeroMassimoPartecpianti(int numeroMassimoPartecpianti) {
        this.numeroMassimoPartecpianti = numeroMassimoPartecpianti;
    }


// TO STRING


    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecpianti=" + numeroMassimoPartecpianti +
                '}';
    }
}
