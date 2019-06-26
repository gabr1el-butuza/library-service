package com.library.service.service;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileService {
    private static final String FILE_DIRECTORY = "src/main/resources/books/";

    public void storeFile(MultipartFile file) throws IOException {
        Path filePath = Paths.get(FILE_DIRECTORY + file.getOriginalFilename());

        Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
    }

//    public String getFileSystem(String filename) throws IOException {
//        File resource = new ClassPathResource(FILE_DIRECTORY +"/"+ filename).getFile();
////        String text = new String(Files.readAllBytes(resource.toPath()));
//        return new String(Files.readAllBytes(resource.toPath()));
//    }
    public Resource getFileSystem(String filename) {
        return getResource(filename);
    }

    private Resource getResource(String filename) {
        Resource resource = null;

        resource = new FileSystemResource(FILE_DIRECTORY + filename);

        return resource;
    }
}
