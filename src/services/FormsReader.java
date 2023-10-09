package services;

import exceptionshandling.CrudException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FormsReader {

    static final String FILE_PATH = "src/resources/forms.txt";

    public static List<String> read() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
            List<String> textLines = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                textLines.add(line);
                line = br.readLine();
            }
            return textLines;

        } catch (IOException e) {
            throw new CrudException("ERROR Caused By: " + e.getMessage());
        }
    }
}

