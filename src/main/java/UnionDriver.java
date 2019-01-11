import io.DataFileReader;
import io.DataFileWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Lan Jiang
 * @since 1/11/19
 */
public class UnionDriver {

    private static final String outputPath = "/Users/Fuga/Documents/HPI/Data/places/union.csv";
    private static final String input_folder = "/Users/Fuga/Documents/HPI/Data/places";

    public static void main(String[] args) throws IOException {
        DataFileWriter dataFileWriter = new DataFileWriter(outputPath);

        File inputFolder = new File(input_folder);
        if (inputFolder.isFile()) {
            throw new RuntimeException("Input folder parameter points to a file.");
        }
        File[] files = inputFolder.listFiles();

        for (File input_file : files) {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(input_file));
            while ((line=bufferedReader.readLine())!=null) {
                dataFileWriter.writeLine(line);
            }
            bufferedReader.close();
        }

        dataFileWriter.close();
    }
}
