package Application;

import Connection.ConexaoBanco;
import Model.Usuario;
import com.mysql.cj.log.Log;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;


public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario(null, "teste@gmail.com", "123456");
        Usuario u2 = new Usuario(null, "teste2@gmail.com", "654321");

        ConexaoBanco conexaoBanco = new ConexaoBanco();
        conexaoBanco.EntityManager(u2);


    }
}
