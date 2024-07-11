package org.example._2024_07_10.jsonYMLxml.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

//подгружает частями
public class SAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        DefaultHandler handler = new DefaultHandler() {

            //доступ к элементу
            @Override
            public void startElement(String url, String localName, String qName, Attributes attributes) {
                String name = attributes.getValue("name");
                if(name != null && !name.isEmpty()) {
                    System.out.println(name);
                }
            }

            //доступ к тексту
            @Override
            public void characters(char[] ch, int start, int length) {
                StringBuilder str = new StringBuilder();
                for (int i = 0; i < length; i++) {
                    str.append(ch[start + i]);
                }
                System.out.println(str);
            }

        };
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(new File("java\\org\\example\\_2024_07_10\\jsonYMLxml\\1.xml"), handler);
    }
}
