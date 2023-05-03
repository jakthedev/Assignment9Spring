package com.coderscampus.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coderscampus.demo.service.FileService;

import java.io.IOException;
import java.util.List;



@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("")
    public List<String> readLines() throws IOException {

        return null;
                //fileService.readFile("/Users/jakthadev/Documents/GitHub/Assignment9Spring/recipe.txt");
    }
}
