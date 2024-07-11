package org.example._2024_07_10.jsonYMLxml.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

//весь документ в память
public class DOM {
    static void print(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if(nodeList.item(i) instanceof Element) {
                System.out.println(((Element) nodeList.item(i)).getTagName());
                if(nodeList.item(i).hasChildNodes()) {
                    print(nodeList.item(i).getChildNodes());
                }
            }
        }
    }

    public static void main(String[] args)
            throws ParserConfigurationException, IOException, SAXException {
        /**
         * DocumentBuilderFactory в Java представляет фабрику для создания объектов DocumentBuilder,
         * которые используются для парсинга XML-документов в объекты типа Document
         */
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        /**
         * DocumentBuilder в Java представляет объект для парсинга XML-документов и
         * создания объектов типа Document, которые представляют структуру и содержимое XML.
         *
         * DocumentBuilder является частью API DOM (Document Object Model)
         * и предоставляет методы для чтения XML-документа и создания объектов
         * Document, Element, Node, Text и других, которые представляют узлы
         * и содержимое XML-документа.
         */
        DocumentBuilder builder = factory.newDocumentBuilder();

        /**
         * Document предоставляет набор методов для доступа к различным
         * элементам XML-документа, его структуре и содержимому
         */
        Document document = builder.parse(new File("src\\PROF\\jsonYMLxml\\xml\\1.txt.xml"));

        /**
         * Element представляет отдельный элемент в XML-документе.
         * Он содержит информацию о теге элемента, его атрибутах и содержимом.
         * Element может иметь дочерние элементы, текстовые узлы, комментарии и другие составляющие XML.
         *
         * Element предоставляет набор методов для доступа к различным атрибутам, со
         * держимому и структуре элемента XML
         */
        Element element = document.getDocumentElement();
        System.out.println(element.getTagName());

        /**
         * NodeList в Java представляет коллекцию узлов в
         * XML-документе. Она является частью стандартного
         * API для работы с XML в Java (DOM - Document Object Model).
         *
         * NodeList представляет упорядоченный список узлов
         * XML, который может содержать различные типы узлов,
         * такие как элементы, текстовые узлы, комментарии и другие.
         * Она обычно используется для доступа к дочерним узлам элемента или
         * результатам запросов к XML-документу.
         */
        NodeList nodeList = element.getChildNodes();
        print(nodeList);
    }
}