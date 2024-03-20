package alessia.dao;

import alessia.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.EntityTransaction;

import java.util.logging.Logger;

public class PersonaDAO {

    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Persona persona){
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(persona);
            transaction.commit();
            System.out.println("Persona salvato con successo");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    };

    public Persona getById(long id) {
        try {
            Persona persona = em.find(Persona.class, id);
            if (persona != null) {
                return persona;
            } else {
                throw new EntityNotFoundException("Persona numero " + id + " non trovato");

            }
        } catch (Exception ex) {
            Logger.getLogger(ex.getMessage());
            throw new RuntimeException("Error " + ex);}}


    public void deletPersona(long id){
        Persona found = this.getById(id);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(found);
        transaction.commit();
        System.out.println("Personao numero " + id + "eliminato con successo");

    };

};
