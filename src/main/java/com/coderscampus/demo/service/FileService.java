package com.coderscampus.demo.service;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.coderscampus.demo.web.FileController;

@Service
public class FileService {

    public List<String> readFile(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
//        try {
//            Reader in = new FileReader(filename);
//            Iterable<CSVRecord> records = CSVFormat.DEFAULT.withIgnoreSurroundingSpaces().parse(in);
//            List<String> values = new ArrayList<>();
//
//            for (CSVRecord record : records) {
//                values.add(record.get(0));
//                values.add(record.get(1));
//                values.add(record.get(2));
//            }
//
//            return values;
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
