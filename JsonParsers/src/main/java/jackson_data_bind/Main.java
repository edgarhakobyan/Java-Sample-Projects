package jackson_data_bind;

import jackson_data_bind.parser.JacksonDataBind;

public class Main {
    public static void main(String[] args) {
        JacksonDataBind.parseJson("src/main/resources/person.json");
    }
}
