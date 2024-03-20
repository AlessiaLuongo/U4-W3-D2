package alessia.dao;

import alessia.entities.Evento;
import alessia.entities.Partecipazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.EntityTransaction;

import java.util.logging.Logger;

public class PartecipazioneDAO {

    private final EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Evento partecipazione){
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(partecipazione);
            transaction.commit();
            System.out.println("Partecipazione salvato con successo");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    };

    public Partecipazione getById(long id) {
        try {
            Partecipazione partecipazione = em.find(Partecipazione.class, id);
            if (partecipazione != null) {
                return partecipazione;
            } else {
                throw new EntityNotFoundException("Partecipazione numero " + id + " non trovato");

            }
        } catch (Exception ex) {
            Logger.getLogger(ex.getMessage());
            throw new RuntimeException("Error " + ex);}}


    public void deletPartecipazione(long id){
        Partecipazione found = this.getById(id);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(found);
        transaction.commit();
        System.out.println("Partecipazione numero " + id + "eliminato con successo");

    };

};
