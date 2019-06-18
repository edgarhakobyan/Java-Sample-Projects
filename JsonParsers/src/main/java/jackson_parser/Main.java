package jackson_parser;

import jackson_parser.parser.JacksonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");
    }
}
