package alessia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class GestioneEventi {
    private static  final EntityManagerFactory emf = Persistence.createEntityManagerFactory("primoDatabase");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("Hello World!");
    }
}
