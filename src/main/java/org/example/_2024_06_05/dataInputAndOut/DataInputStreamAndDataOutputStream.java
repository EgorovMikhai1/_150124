package org.example._2024_06_05.dataInputAndOut;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//записываем и читаем примитивы
public class DataInputStreamAndDataOutputStream {
    public static void main(String[] args) {
        Path path = Paths.get("dataOS.bin");
        try (DataOutputStream outputStream
                     = new DataOutputStream(Files.newOutputStream(path));
             DataInputStream inputStream =
                     new DataInputStream(Files.newInputStream(path))){
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeLong(120);
            outputStream.writeInt(123654);
            outputStream.writeFloat(151.151f);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readFloat());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}