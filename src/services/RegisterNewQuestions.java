package services;

import exceptionshandling.CrudException;

import java.io.*;
import java.util.Scanner;

public class RegisterNewQuestions {
    static final String FILE_PATH = "src/resources/forms.txt";

    public RegisterNewQuestions() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite a sua pergunta abaixo: \n");
            String question = sc.nextLine();


            if(question != null){
                BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH));
                BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));

                String lastLine, line;
                while((line = br.readLine()) != null){
                    lastLine = line;
                }

                //TODO finish register new questions method
                // lastLine.split()

            } else {
                throw new CrudException("Vocẽ não pode inserir um valor nulo como input.");
            }

        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

}
