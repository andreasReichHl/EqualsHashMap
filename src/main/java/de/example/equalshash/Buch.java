package de.example.equalshash;

import java.util.Objects;

public class Buch {
    private String titel;
    private String author;
    private String isbn;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Buch(String titel, String author, String isbn) {
        this.titel = titel;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buch buch = (Buch) o;
        return Objects.equals(titel, buch.titel) && Objects.equals(author, buch.author) && Objects.equals(isbn, buch.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel, author, isbn);
    }
}
