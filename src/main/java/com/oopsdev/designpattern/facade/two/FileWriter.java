package com.oopsdev.designpattern.facade.two;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileWriter {
    public void writeFile(String filePath, String content) throws IOException {
        Files.write(Paths.get(filePath), content.getBytes());
    }
}
