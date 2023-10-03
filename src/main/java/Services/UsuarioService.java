package Services;

import Model.Usuario;

import jakarta.persistence.*;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public class UsuarioService {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");

    public void cadastrarUsuario(Usuario usuario) {

        EntityManager em = emf.createEntityManager();

        String login = usuario.getLogin();

        // Verifica se o usuário já existe no banco de dados
        List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u WHERE u.login = :login", Usuario.class).setParameter("login", login).getResultList();

        if (usuarios.contains(usuario)) {
            // Caso o usuário seja encontrado
            System.out.println("Usuário já existe: " + usuario.getLogin());
            em.close();
        } else {
            // caso o usuário não seja encontrado
            //Criando uma criptografia para a senha
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));

            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            em.close();

            // Mensagem de sucesso
            System.out.println("Usuário adicionado com sucesso: " + usuario.getLogin());
        }

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

        System.out.println("Usuário atualizado com sucesso");
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
        System.out.println("Usuário excluído com sucesso");
    }

    public Usuario buscarPorId(Long id) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Usuario usuario = em.find(Usuario.class, id);

            em.getTransaction().commit();

            return usuario;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            em.close();
        }
    }

    public List<Usuario> listarUsuarios() {

        EntityManager em = emf.createEntityManager();
        TypedQuery<Usuario> query = em.createQuery("SELECT * FROM Usuario", Usuario.class);
        List<Usuario> usuarios = query.getResultList();
        em.close();
        return usuarios;
    }


}