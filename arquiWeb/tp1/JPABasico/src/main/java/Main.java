import entities.Persona;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Insert {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Example");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Persona j=em.find(Persona.class,1);
        System.out.println("persona1"+j);
        List<Persona> personas=em.createQuery("SELECT p FROM Persona p").getResultList();
        personas.forEach(p->System.out.println(p));
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
