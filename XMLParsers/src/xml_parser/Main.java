package xml_parser;

public class Main {
    public static void main(String[] args) {
        MyXmlParser myXmlParser = new MyXmlParser("src/xml_parser/my_xml.xml");

        System.out.println(myXmlParser.get("catalog/book/author"));
    }
}
