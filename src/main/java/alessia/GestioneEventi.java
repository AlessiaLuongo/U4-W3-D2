package alessia;

import alessia.dao.EventiDAO;
import alessia.entities.Evento;
import alessia.entities.eventType;
import com.github.javafaker.Faker;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class GestioneEventi {
    private static  final EntityManagerFactory emf = Persistence.createEntityManagerFactory("primoDatabase");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventiDAO eventoDao = new EventiDAO(em);

   /*   Evento evento1 = new Evento("Compleanno", 2024- 2 - 3, "Compleanno favoloso", eventType.PRIVATO, 25);
        Evento evento2 = new Evento("Natale", 2024- 12- 24, "Natale con le famiglie", eventType.PRIVATO, 15);
        Evento evento3 = new Evento("Pasquetta", 2024- 1- 4, "Pasquetta con gli amici", eventType.PRIVATO, 35);
        Evento evento4 = new Evento("Concerto", 2025-5-7, "Concerto Annihilator", eventType.PUBBLICO, 5000);
        Evento evento5 = new Evento("Concerto", 2026-2-8, "Concerto Meat Loaf", eventType.PUBBLICO, 8000);

        eventoDao.save(evento1);
        eventoDao.save(evento2);
        eventoDao.save(evento3);
        eventoDao.save(evento4);
        eventoDao.save(evento5);
    */

        System.out.println("ECCO IL TUO EVENTO: "+ eventoDao.getById(1));


        em.close();
        emf.close();
    }
}
