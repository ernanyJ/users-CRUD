package Program;

import services.FormsReader;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        System.out.println("""
                                
                 =========================================
                ||                                       ||
                ||                                       ||
                ||    1 - Cadastrar Usuários             ||
                ||    2 - Listar todos os usuários       ||
                ||    3 - Cadastrar nova pergunta        ||
                ||    4 - Deletar pergunta               ||
                ||    5 - Pesquisar por nome/idd/email   ||
                ||                                       ||
                ||                                       ||
                 =========================================
                                
                """);

        System.out.println(FormsReader.read());





    }
}
