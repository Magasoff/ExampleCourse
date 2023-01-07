import java.util.Objects;

public class Book {
    private String name;
    private String lastName;
    private String middleName;
    private String nameBook;

    public Book(String name, String lastName, String middleName, String nameBook) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nameBook = nameBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(lastName, book.lastName) && Objects.equals(middleName, book.middleName) && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, middleName, nameBook);
    }

    @Override
    public String toString() {
        return " Название книги " + nameBook + " Автор: " + name + lastName + middleName;
    }
}
