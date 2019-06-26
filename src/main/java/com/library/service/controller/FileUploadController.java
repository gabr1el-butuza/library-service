package com.library.service.controller;

import com.library.service.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class FileUploadController {

    @Autowired
    FileService fileService;


    @PostMapping("/file")
    @ResponseStatus(HttpStatus.OK)
    public void handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        fileService.storeFile(file);
    }

    @GetMapping(value = "/files/{filename}")
    @ResponseStatus(HttpStatus.OK)
    public Resource getFileFromFileSystem(@PathVariable String filename) throws IOException {
        System.out.println("Get file successs!!!" + fileService.getFileSystem(filename));
        return fileService.getFileSystem(filename);
    }
}
