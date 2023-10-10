package Program;

import services.FormsReader;
import services.RegisterNewQuestions;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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

        int opt = sc.nextInt();

        switch(opt){
            case 1:
                break;
            case 2:
                FormsReader.read();
                break;
            case 3:
                RegisterNewQuestions.register();
                break;
        }

        RegisterNewQuestions.register();


    }
}
