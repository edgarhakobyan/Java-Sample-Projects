package jaxb_parser;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "catalog")
public class Catalog {
    @XmlElement(name = "book")
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(books.toArray());
    }
}
