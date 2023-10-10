package services;

import exceptionshandling.CrudException;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class RegisterNewQuestions {
    static final String FILE_PATH = "src/resources/forms.txt";

    public static void register() {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite a sua pergunta abaixo: \n");
            String question = sc.nextLine();

            if (question != null) {
                BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));

                String lastLine = "", line;

                while ((line = br.readLine()) != null) {
                    lastLine = line;
                }

                String[] splited = splitLine(lastLine);
                int nextNumber = (parseInt(splited[0])) + 1;
                System.out.println(nextNumber);

                BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true));

                String str = nextNumber + " - " + question;
                bw.newLine();
                bw.write(str);
                bw.close();

            } else
                throw new CrudException("Vocẽ não pode inserir um valor nulo.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String[] splitLine(String lastLine) {
        return lastLine.split(" -");
    }

}
