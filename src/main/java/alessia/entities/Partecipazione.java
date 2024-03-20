package alessia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "persona")
    private Persona persona;
    @ManyToOne()
    @JoinColumn(name = "evento")
    private Evento evento;
    @Enumerated(EnumType.STRING)
    stato stato;


// CONSTRUCTORS


    public Partecipazione() {
    }

    public Partecipazione(Persona persona, Evento evento, alessia.entities.stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

// GETTERS & SETTERS


    public long getId() {
        return id;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public alessia.entities.stato getStato() {
        return stato;
    }

    public void setStato(alessia.entities.stato stato) {
        this.stato = stato;
    }

// TO STRING


    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona=" + persona +
                ", evento=" + evento +
                ", stato=" + stato +
                '}';
    }
}
