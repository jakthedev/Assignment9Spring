package com.coderscampus.demo.web;

import com.coderscampus.demo.domain.Recipe;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coderscampus.demo.service.FileService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;



@RestController
public class FileController {

    @Value("${superuser.username}")
    private String superuserUsername;

    @Value("${superuser.password}")
    private String superuserPassword;

    @Value("${superuser.name}")
    private String superuserName;

    @Autowired
    private FileService fileService;

    @GetMapping("/")
    public List<String> readLines() throws IOException {
        System.out.println(superuserUsername);
        System.out.println(superuserPassword);
        System.out.println(superuserName);

        return fileService.readFile("recipe.txt");
    }


    }



