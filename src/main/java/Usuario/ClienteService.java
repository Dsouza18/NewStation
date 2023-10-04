package Usuario;

import Cliente.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ClienteService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");

    public void cadastrarUsuario(Cliente cliente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }
}