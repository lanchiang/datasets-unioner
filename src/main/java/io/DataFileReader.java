package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lan Jiang
 * @since 1/11/19
 */
public class DataFileReader {

    private final String inputPath;
    private final BufferedReader bufferedReader;

    public DataFileReader(String inputPath) throws FileNotFoundException {
        this.inputPath = inputPath;
        bufferedReader = new BufferedReader(new FileReader(inputPath));
    }



    public String readLine() throws IOException {
        String line = bufferedReader.readLine();
        return line;
    }

    public void close() throws IOException {
        bufferedReader.close();
    }
}
