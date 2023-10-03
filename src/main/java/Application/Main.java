package Application;


import Model.Usuario;
import Services.UsuarioService;
import entities_Enum.Funcao;
public class Main {
    public static void main(String[] args) {


        Model.Usuario usuario = new Model.Usuario();
        usuario.setId(0L);
        usuario.setLogin("teste3");
        usuario.setSenha("010203");
        usuario.setFuncao(Funcao.ADMINISTRADOR);
        usuario.setEstado(true);

        UsuarioService u1 = new UsuarioService();
        u1.cadastrarUsuario(usuario);
    }
}
