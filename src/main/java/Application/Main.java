package Application;

import Connection.ConexaoBanco;
import Model.Usuario;



public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario(null, "teste@gmail.com", "123456");
        Usuario u2 = new Usuario(null, "teste2@gmail.com", "654321");

        ConexaoBanco conexaoBanco = new ConexaoBanco();
        conexaoBanco.EntityManager(u2);

        System.out.println("Pronto");


    }
}
