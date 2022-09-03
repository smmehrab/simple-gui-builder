/*
-----------------------------------------------------
# fullname      :   s.m.mehrabul islam
# roll          :   sh-86
# registration  :   2017614964
# session       :   2017-2018
# email         :   smmehrabul-2017614964@cs.du.ac.bd
# department    :   computer science & engineering
# institute     :   university of dhaka, bangladesh
-----------------------------------------------------

** Adapter Design Pattern **

XMLAdaptee for XMLAdapter
(Or service provided by the XMLAdapter)

*/

package config.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import config.ConfigComponent;
import enums.ComponentType;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLAdaptee {

    public NodeList parse(File file) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } 
        catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        Document document = null;
        try {
            document = documentBuilder.parse(file);
        } 
        catch (SAXException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
        document.getDocumentElement().normalize();
        NodeList nodeList = document.getElementsByTagName("component");
        return nodeList;
    }

    public ConfigComponent getComponent(Node node) {
        ComponentType type = ComponentType.None;
        String text = "";
        String color = "";
        int x = -1;
        int y = -1;
        
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) node;
            // Debug
            // System.out.println("type: "+ eElement.getElementsByTagName("type").item(0).getTextContent());
            // System.out.println("text: "+ eElement.getElementsByTagName("text").item(0).getTextContent());
            // System.out.println("   x: "+ eElement.getElementsByTagName("x").item(0).getTextContent());
            // System.out.println("   y: "+ eElement.getElementsByTagName("y").item(0).getTextContent());
            type = ComponentType.fromString(eElement.getElementsByTagName("type").item(0).getTextContent());
            text = eElement.getElementsByTagName("text").item(0).getTextContent();
            x = Integer.parseInt(eElement.getElementsByTagName("x").item(0).getTextContent());
            y = Integer.parseInt(eElement.getElementsByTagName("y").item(0).getTextContent());
        }

        ConfigComponent component = new ConfigComponent(type, text, color, x, y);
        return component;
    }
}
