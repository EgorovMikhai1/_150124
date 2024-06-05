package org.example._2024_06_05.filePathRandomTaski;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationExamples {

    public static void main(String[] args) throws IOException {
        copyFileUsingFileStreams();
        copyFileUsingPath();
        copyFileUsingRandomAccessFile();
    }

    // Задание 1: Работа с классом File

    /**
     * Написать метод, который создает файл с именем
     * "222.txt" в текущей директории, затем копирует
     * этот файл с использованием FileInputStream и записывает
     * его содержимое в новый файл "copy_example.txt" с использованием FileOutputStream.
     */
    public static void copyFileUsingFileStreams() throws IOException {
        File sourceFile = new File("example.txt");
        File destinationFile = new File("copy_example.txt");
    }

    // Задание 2: Работа с классом Path44

    /**
     * Написать метод, который использует Path и Files
     * для копирования файла "222.txt" в новый файл "copy222path.txt".
     * Проверить, существует ли файл "example.txt" перед копированием.
     */
    public static void copyFileUsingPath() throws IOException {
        Path sourcePath = Paths.get("222.txt");
        Path destinationPath = Paths.get("copy222path.txt");
    }

    // Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "222.txt"
     * с использованием RandomAccessFile, читает первые 20 байт и записывает
     * их в новый файл "random_access_copy.txt".
     */
    public static void copyFileUsingRandomAccessFile() throws IOException {
        try (RandomAccessFile sourceFile = new RandomAccessFile("222.txt", "r");
             FileOutputStream fos = new FileOutputStream("random_access_copy.txt")) {

        }
    }
}