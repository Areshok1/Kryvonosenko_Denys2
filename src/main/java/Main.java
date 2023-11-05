public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класу Library та інших необхідних об'єктів
        Library library = new Library();

        Patron patron1 = new Patron("John Doe", "12345");
        Patron patron2 = new Patron("Jane Smith", "67890");

        Item book1 = new Book("Introduction to Java", "B001", "John Smith");
        Item book2 = new Book("Java Programming", "B002", "Alice Johnson");
        Item dvd1 = new DVD("Java Basics", "D001", 120);
        Item dvd2 = new DVD("Advanced Java", "D002", 180);

        // Реєстрація читачів у бібліотеці
        library.registerPatron(patron1);
        library.registerPatron(patron2);

        // Додавання предметів у бібліотеку
        library.add(book1);
        library.add(book2);
        library.add(dvd1);
        library.add(dvd2);

        // Видача предметів читачам
        library.lendItem(patron1, book1);
        library.lendItem(patron1, dvd1);
        library.lendItem(patron2, book2);

        // Повернення предметів у бібліотеку
        library.returnItem(patron1, book1);
        library.returnItem(patron1, dvd1);

        // Виведення списку доступних та взятих в позику предметів
        System.out.println("Available Items: " + library.listAvailable());
        System.out.println("Borrowed Items: " + library.listBorrowed());
    }
}
