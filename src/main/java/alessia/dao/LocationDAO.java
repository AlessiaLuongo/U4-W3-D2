package alessia.dao;

import alessia.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.EntityTransaction;

import java.util.logging.Logger;

public class LocationDAO {

    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }


    public void save(Location location){
        try {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.persist(location);
            transaction.commit();
            System.out.println("Location salvato con successo");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    };

    public Location getById(long id) {
        try {
            Location location = em.find(Location.class, id);
            if (location != null) {
                return location;
            } else {
                throw new EntityNotFoundException("Location numero " + id + " non trovato");

            }
        } catch (Exception ex) {
            Logger.getLogger(ex.getMessage());
            throw new RuntimeException("Error " + ex);}}


    public void deletLocation(long id){
        Location found = this.getById(id);

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.remove(found);
        transaction.commit();
        System.out.println("Location numero " + id + "eliminato con successo");

    };

};
