package repository;

import dao.DireccionDao;
import entities.Direccion;

import javax.persistence.EntityManager;

public class MySqlDireccionDao implements DireccionDao {
    private EntityManager em;
    private static MySqlDireccionDao instance;
    public MySqlDireccionDao(EntityManager em) {
        this.em = em;
    }
    public static MySqlDireccionDao getInstance(EntityManager em) {
        if (instance == null) {
            instance = new MySqlDireccionDao(em);
        }
        return instance;
    }

    @Override
    public int insert(Direccion direccion) {
        em.getTransaction().begin();
        em.persist(direccion);
        em.getTransaction().commit();
        return direccion.getId();
    }

    @Override
    public void delete(int id) {
        em.getTransaction().begin();
        em.remove(em.find(Direccion.class, id));
        em.getTransaction().commit();
    }

    @Override
    public Direccion findDireccion(int id) {
        return em.find(Direccion.class, id);
    }
}
