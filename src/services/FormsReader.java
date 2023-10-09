package services;

import ExceptionsHandling.ReaderException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FormsReader {


    public static List<String> read() {

        String filePath = "C:\\Users\\julio\\Desktop\\usersCRUD\\src\\resources\\forms.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            List<String> textLines = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                textLines.add(line);
                line = br.readLine();
            }
            return textLines;

        } catch (IOException e) {
            throw new ReaderException(e.getMessage());
        }
    }
}

