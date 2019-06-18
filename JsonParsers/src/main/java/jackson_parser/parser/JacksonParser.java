package jackson_parser.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import jackson_parser.entity.CurrencyRate;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        CurrencyRate[] currencyRates = objectMapper.readValue(new URL(url), CurrencyRate[].class);

        for (CurrencyRate currencyRate : currencyRates) {
            System.out.println(currencyRate);
        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(currencyRates);

        Files.write(Paths.get("src/main/resources/jacksonCurrency.json"),
                jsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
