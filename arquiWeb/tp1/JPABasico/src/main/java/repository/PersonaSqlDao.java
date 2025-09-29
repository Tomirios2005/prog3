package repository;

import dao.PersonaDao;
import dto.PersonaDTO;
import entities.Persona;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.Collection;

public class MySqlPersonaDao implements PersonaDao {
    private static MySqlPersonaDao instance;
    private EntityManager em;

    public MySqlPersonaDao(EntityManager entityManager) {
        em = entityManager;
    }
    public static MySqlPersonaDao getInstance(EntityManager entityManager) {
        if (instance==null){
            instance=new MySqlPersonaDao(entityManager);
        }
        return instance;
    }



    @Override
    public int insertPersona(Persona p) {

        this.em.getTransaction().begin();
        this.em.persist(p);
        this.em.getTransaction().commit();
        return p.getId();
    }

    @Override
    public void deletePersona(int id) {
        this.em.getTransaction().begin();
        em.remove(em.find(Persona.class, id));
        this.em.getTransaction().commit();
    }

    @Override
    public Persona findPersona(int id) {
        return em.find(Persona.class, id);

    }

    @Override
    public Collection<PersonaDTO> selectPersonas() {
        return em.createQuery(
                "SELECT new dto.PersonaDTO(p.nombre, p.edad) FROM Persona p",
                PersonaDTO.class
        ).getResultList();
    }

}
