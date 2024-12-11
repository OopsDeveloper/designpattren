package com.oopsdev.designpattern.facade.two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDeleter {
    public void deleteFile(String filePath) throws IOException {
        Files.delete(Paths.get(filePath));
    }
}
