package dom_parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        parseXML();
        saveXml();
    }

    private static void parseXML() {
        try {
            File file = new File("src/dom_parser/test.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(file);

            Element root = document.getDocumentElement();
            System.out.println("Root: " + root.getNodeName());
            System.out.println();

            NodeList nodeList = root.getChildNodes();
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Book:");
                    System.out.println("Author: " + element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("----------------------");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveXml() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            Element rootElement = doc.createElement("catalog");
            doc.appendChild(rootElement);

            Element book1 = doc.createElement("book");
            rootElement.appendChild(book1);

            Element author1 = doc.createElement("author");
            author1.setTextContent("Author 1");
            book1.appendChild(author1);

            Element book2 = doc.createElement("book");
            rootElement.appendChild(book2);

            Element author2 = doc.createElement("author");
            author2.setTextContent("Author 2");
            book2.appendChild(author2);

            // save
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("src/dom_parser/test2.xml"));

            t.transform(source, sr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
