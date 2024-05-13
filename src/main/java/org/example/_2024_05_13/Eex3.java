//package org.example._2024_05_13;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class Eex3 {
//
//    public static void getEx() throws Exception {
//
//    }
//
//    public static void get1() throws Exception {
//        getEx();
//    }
//
//    public static void get2() {
//        try {
//            get1();
//        } catch (Exception e) {
//            System.out.println("Exception");
//        } catch (IOException e) {
//            System.out.println("Exception");
//        } catch (FileNotFoundException e) {
//            System.out.println("Exception");
//        }
//    }
//
//    public static void get22() {
//        try {
//            get1();
//        } catch (FileNotFoundException e) {
//            System.out.println("Exception");
//        } catch (IOException e) {
//            System.out.println("Exception");
//        } catch (Exception e) {
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
