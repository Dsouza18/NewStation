package Application;


import Usuario.Usuario;
import Usuario.UsuarioService;
import entities_Enum.Funcao;
public class Main {
    public static void main(String[] args) {


        Usuario usuario = new Usuario();
        usuario.setId(0L);
        usuario.setLogin("teste2");
        usuario.setSenha("123654");
        usuario.setFuncao(Funcao.FUNCIONARIO);
        usuario.setEstado(true);

        UsuarioService u1 = new UsuarioService();
        u1.excluirUsuario(usuario);
    }
}
