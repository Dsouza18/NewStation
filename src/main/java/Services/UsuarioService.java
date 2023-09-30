package Services;

import Model.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class UsuarioService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");

    public void cadastrarUsuario(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //Realizar a inserção do usuário no banco de dados
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public void editarUsuario(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Verifica se o usuário já está gerenciado pelo EntityManager
        if (!em.contains(usuario)) {
            usuario = em.merge(usuario);
        }

        // Atualiza os campos do usuário
        usuario.setLogin("Novo Login");
        usuario.setSenha("Nova senha");

        em.getTransaction().commit();
        em.close();
    }
    public void excluirUsuario(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        // Verifica se o usuário já está gerenciado pelo EntityManager
        if (!em.contains(usuario)) {
            usuario = em.merge(usuario);
        }

        // Remove o usuário
        em.remove(usuario);

        em.getTransaction().commit();
        em.close();
    }
    public List<Usuario> listarUsuarios() {

        EntityManager em = emf.createEntityManager();
        TypedQuery<Usuario> query = em.createQuery("SELECT * FROM Usuario", Usuario.class);
        List<Usuario> usuarios = query.getResultList();
        em.close();
        return usuarios;
    }

}