package Connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConexaoBanco<T> {
    public void EntityManager(T entities){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entities);
        em.getTransaction().commit();
        em.close();
    }
}
