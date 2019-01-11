package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Lan Jiang
 * @since 1/11/19
 */
public class DataFileWriter {

    private final String output_path;
    private final BufferedWriter bufferedWriter;

    public DataFileWriter(String output_path) throws IOException {
        this.output_path = output_path;
        bufferedWriter = new BufferedWriter(new FileWriter(output_path));
    }

    public void writeLine(String line) throws IOException {
        bufferedWriter.write(line);
        bufferedWriter.newLine();
    }

    public void close() throws IOException {
        bufferedWriter.close();
    }
}
