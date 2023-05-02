package service;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileService {

    public List<String> readline() {
        try {
            Reader in = new FileReader("recipe.txt");
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().parse(in);
            List<String> values = new ArrayList<>();

            System.out.println(values);

//            for (CSVRecord record : records) {
//                //values.add(record.get(0));
//                values.add(record.get(1));
//                //values.add(record.get(2));
//            }

            return values;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
