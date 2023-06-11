import org.w3c.dom.ls.LSOutput;

public class TestBook {
    public static void main(String[] args) {
        Author jJones = new Author("James Jones", "james@jones.net", 'm');
        System.out.println(jJones);

        Book tTRL = new Book("The Thin Red Line", jJones, 18.0, 150);
        System.out.println(tTRL);

        tTRL.setPrice(28.5);
        tTRL.setQty(50);
        System.out.println("Title: " + tTRL.getName());
        System.out.println("Price: " + tTRL.getPrice());
        System.out.println("Qty: " + tTRL.getQty());
        System.out.println("Author: " + tTRL.getAuthor());
        System.out.println("Author's name: " + tTRL.getAuthor().getName());
        System.out.println("Author's email: " + tTRL.getAuthor().getEmail());

        Book book = new Book("Something", new Author("Geri", "ge@ri.net", 'm'), 5.95);
        System.out.println(book);
    }
}
