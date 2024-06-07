package org.example._2024_06_05;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class FileSearcher {
    public static void main(String[] args) {

        List<File> files = new LinkedList<>();
        long startTime = System.currentTimeMillis();

        searchFile(new File("E:\\"), files);

        long endTime = System.currentTimeMillis();

        System.out.println("************************************");
        System.out.println("TIME: " + (endTime - startTime));
        System.out.println("************************************");

        files.forEach(System.out::println);
    }

    //сделать точно такой же, но не рекурсивно
    private static void searchFile(File rootFile, List<File> files) {
        if(rootFile.isDirectory()) {
            //System.out.println("Searching for.... " + rootFile.getAbsolutePath());
            File[] subFiles = rootFile.listFiles();
            if(subFiles != null) {
                for(File subFile : subFiles) {
                    if(subFile.isDirectory()) {
                        searchFile(subFile, files);
                    } else {
                        if(subFile.getName().endsWith(".pdf")) {
                            files.add(subFile);
                        }
                    }
                }
            }
        }
    }

    //реализовать поиск файлов только при помощи Path Files walkFileTree()
//    private static void searchFilewalkTreeFiles(File rootFile, List<File> files) {
//        Path rootPath = rootFile.toPath();
//
//        Files.walkFileTree(rootFile, )
//    }
}
