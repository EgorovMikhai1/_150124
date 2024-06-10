package org.example._2024_06_10;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Service1Test {

    @Test
    void printMessage() {
        Service1 service1 = new Service1();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        service1.printMessage("JAVA");

        Assertions.assertTrue(outputStream.toString().contains("JAVA"));
        Assertions.assertEquals("JAVA", outputStream.toString());
    }
}