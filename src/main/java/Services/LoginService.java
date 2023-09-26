package Services;

import Model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;


public class LoginService {

    private EntityManagerFactory emf;

    public void ServicoLogin() {
        emf = Persistence.createEntityManagerFactory("MinhaUnidadeDePersistencia");
    }

    public boolean validarCredenciais(String username, String password) {
        EntityManager em = emf.createEntityManager();
        try {
            // Consulta para verificar se o usuário com as credenciais fornecidas existe no banco de dados
            String jpql = "SELECT u FROM Usuario u WHERE u.login = :username AND u.senha = :password";
            TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
            query.setParameter("username", username);
            query.setParameter("password", password);

            // Execute a consulta
            Usuario usuario = query.getSingleResult();

            // Se a consulta não lançar uma exceção, as credenciais são válidas
            return true;
        } catch (Exception e) {

            // Trate qualquer exceção aqui (por exemplo, usuário não encontrado, erro de consulta, etc.)
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }
    public void destroy() {
        emf.close();
    }
}

