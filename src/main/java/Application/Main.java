package Application;


import Model.Usuario;
import Services.UsuarioService;
import entities_Enum.Funcao;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("teste", "123456", Funcao.ADMINISTRADOR);
        UsuarioService us = new UsuarioService();
        us.cadastrarUsuario(usuario1);
        System.out.println("usuario cadastrado");

    }
}
