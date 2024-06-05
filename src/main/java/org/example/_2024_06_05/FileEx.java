package org.example._2024_06_05;

import java.io.File;
import java.io.IOException;

/**
 * Класс File в Java представляет файл или директорию на файловой
 * системе. Он используется для работы с файлами и папками,
 * создания, удаления, переименования, перемещения и получения
 * информации о файлах.
 *
 *
 * Основные методы класса File:
 *
 * createNewFile(): Создает новый файл на файловой системе.
 * getName(): Возвращает имя файла или директории.
 * getAbsolutePath(): Возвращает абсолютный путь к файлу или директории.
 * length(): Возвращает размер файла в байтах.
 * isDirectory(): Проверяет, является ли файл директорией.
 * renameTo(File dest): Переименовывает файл в указанный путь.
 * delete(): Удаляет файл или директорию.
 * Плюсы класса File:
 *
 * Позволяет работать с файлами и директориями на файловой системе.
 * Предоставляет различные методы для управления файлами,
 * такие как создание, удаление, переименование и перемещение.
 * Легко получить информацию о файле, такую как имя, путь и размер.
 * Минусы класса File:
 *
 * Класс File не предоставляет прямой способ для чтения и
 * записи данных в файл. Для этого требуется использовать
 * другие классы, такие как FileInputStream и FileOutputStream.
 * Класс File не гарантирует, что файл или директория фактически
 * существуют на файловой системе. Он только представляет путь к
 * файлу или директории.
 */
public class FileEx {
    public static void main(String[] args) {
        File file = new File("ex.txt");

        try {
            boolean isCreateted = file.createNewFile();
            if(isCreateted) {
                System.out.println("PATH: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("INFO: " + file.getName());
        System.out.println("FILE LENGTH: " + file.length());

    }
}
