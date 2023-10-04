package Usuario;

import Controller.LoginDTO;
import Exceptions.NegocioExpection;
import entities_Enum.Funcao;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.swing.*;

public class AutenticacaoService {

    private final UsuarioService usuarioService;

    public AutenticacaoService(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public boolean temPermissao(Usuario usuario){
        try{
            permissao(usuario);
            return true;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Usuário sem permissão", 0);
            return false;
        }
    }

    private void permissao(Usuario usuario){
        if(!Funcao.ADMINISTRADOR.equals(usuario.getFuncao())){
            throw new NegocioExpection("Sem permissão para realizar essa ação");
        }
    }
    public Usuario login(LoginDTO login){
        Usuario usuario = usuarioService.buscarPorId(Long.valueOf(login.getUsuario()));

        if(usuario == null || !usuario.isEstado())
            return null;

            if(validarSenha(usuario.getSenha(), login.getSenha())){
                return usuario;
        } return null;
    }
    private boolean validarSenha(String senhaUsuario, String senhaLogin) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(senhaLogin, senhaUsuario);
    }
}
