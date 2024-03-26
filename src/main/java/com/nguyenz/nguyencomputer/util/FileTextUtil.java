package com.nguyenz.nguyencomputer.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileTextUtil {
    public static void writeToFile(List<String> list, String path) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        for (String str : list) {
            fileWriter.write(str + System.lineSeparator());
        }
        fileWriter.close();
    }

    public static void readFile(String path) throws IOException {
        FileReader fr=new FileReader(path);
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }

    public static void main(String[] args) throws IOException {
        List<String> list = Arrays.asList("Java","Spring Boot","Hibernate","JPA");
        String filePath = Paths.get("").toAbsolutePath()
                .resolve("src/main/resources/data.txt").toString();
        writeToFile(list,filePath);

        readFile(filePath);
    }
}
