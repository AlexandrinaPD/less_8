package first;

public class Main {
    public static void main(String[] args) {

        Book book2 = new Book();
        book2.name = "Harry Potter and the Philosopher's Stone";
        book2.author = "J. K. Rowling";
        book2.cover = "hardcover";
        book2.date = 1997;
        book2.pages = 223;
        book2.cost = 400.00;

        printInfo(book2);

        PostOffice postOffice1 = new PostOffice();
        postOffice1.name = "NowaPoshta";
        postOffice1.address = "St. Borodinska 11";
        postOffice1.workTime = "9:00 - 20:00";
        postOffice1.employers = 7;

        printInfo(postOffice1);

        Client client1 = new Client();
        client1.name = "Oleksandra";
        client1.age = 25;
        client1.gender = "wom";
        client1.money = 500;
        client1.bonusCard = true;

        printInfo(client1);

    }
    public static void printInfo(Book book1) {
        System.out.println("Name = " + book1.name);
        System.out.println("Author = " + book1.author);
        System.out.println("Cover = " + book1.cover);
        System.out.println("Date = " + book1.date);
        System.out.println("Pages = " + book1.pages);
        System.out.println("Cost = " + book1.cost);
        System.out.println("Bar code = " + book1.barCode + "\n");
    }

    public static void printInfo(Client client1) {
        System.out.println("Name = " + client1.name);
        System.out.println("Age = " + client1.age);
        System.out.println("Gender = " + client1.gender);
        System.out.println("Bonus Card = " + client1.bonusCard);
        System.out.println("Money = " + client1.money);
        System.out.println("Client number = " + client1.number + "\n");
    }

    public static void printInfo(PostOffice postOffice1) {
        System.out.println("Name = " + postOffice1.name);
        System.out.println("Address = " + postOffice1.address);
        System.out.println("Work time = " + postOffice1.workTime);
        System.out.println("Number of employees = " + postOffice1.employers + "\n");
    }
}
