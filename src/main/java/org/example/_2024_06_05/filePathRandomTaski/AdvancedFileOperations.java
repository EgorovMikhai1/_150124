package org.example._2024_06_05.filePathRandomTaski;

import java.io.*;

public class AdvancedFileOperations {

    public static void main(String[] args) throws IOException {
        countWordsInFile();
        findTxtFilesInDirectory();
        copyLastParagraphUsingRandomAccess();
    }

    //Задание 1: Работа с классом File

    /**
     * Написать метод, который читает файл "222.txt",
     * подсчитывает количество слов в файле и записывает это количество
     * в новый файл "word_count.txt". Использовать BufferedReader и BufferedWriter
     * для эффективной работы с текстом.
     */
    public static void countWordsInFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("word_count.txt"))) {
        }
    }

    // Задание 2: Работа с классом Path

    /**
     * Написать метод, который ищет все файлы с расширением ".txt"
     * в текущей директории и её поддиректориях. Результаты поиска
     * (пути к файлам) записать в файл "found_files.txt".
     */
    public static void findTxtFilesInDirectory()  {

    }

    // Задание 3: Работа с классом RandomAccessFile

    /**
     * Написать метод, который открывает файл "222.txt"
     * с использованием RandomAccessFile, переходит к последнему абзацу (добавьте текста если надо)
     * в файле и копирует его содержимое в новый файл "last_paragraph.txt".
     */
    public static void copyLastParagraphUsingRandomAccess() throws IOException {
        try (RandomAccessFile sourceFile = new RandomAccessFile("222.txt", "r");
             FileOutputStream fos = new FileOutputStream("last_paragraph.txt")) {

        }
    }
}