package second;

public class Main {

    public static void main(String[] args) {


        Books book1 = new Books();
        book1.setName("Harry Potter and the Philosopher's Stone");
        book1.setAuthor("J. K. Rowling");
        book1.setCover("hardcover");
        book1.setDate(1997);
        book1.setPages(223);
        book1.setCost(400.00);

        Clients client1 = new Clients();
        client1.setName("Oleksandra");
        client1.setAge(25);
        client1.setGender("wom");
        client1.setMoney(500);
        client1.isBonusCard(true);

        PostOffices postOffice1 = new PostOffices();
        postOffice1.setName("NowaPoshta");
        postOffice1.setAddress("St. Borodinska 11");
        postOffice1.setWorkTime("9:00 - 20:00");
        postOffice1.setEmployers(7);

        printInfo(book1,client1,postOffice1);
    }

    public static void printInfo(Books book1) {
        System.out.println("Name = " + book1.getName());
        System.out.println("Author = " + book1.getAuthor());
        System.out.println("Cover = " + book1.getCover());
        System.out.println("Date = " + book1.getDate());
        System.out.println("Pages = " + book1.getPages());
        System.out.println("Cost = " + book1.getCost());
        System.out.println("Bar code = " + Books.getBarCode() + "\n");
    }

    public static void printInfo(Clients client1) {
        System.out.println("Name = " + client1.getName());
        System.out.println("Age = " + client1.getAge());
        System.out.println("Cover = " + client1.getGender());
        System.out.println("Bonus card = " + client1.isBonusCard());
        System.out.println("Money = " + client1.getMoney());
        System.out.println("Number client = " + Clients.getNumber() + "\n");
    }

    public static void printInfo(PostOffices postOffice1) {
        System.out.println("Name = " + postOffice1.getName());
        System.out.println("Address = " + postOffice1.getAddress());
        System.out.println("Work time = " + postOffice1.getWorkTime());
        System.out.println("Number of employees = " + postOffice1.getEmployers());
        System.out.println("Pass = " + PostOffices.getPass() + "\n");
    }

    public static void printInfo(Books book1, Clients client1, PostOffices postOffices1){
        System.out.println("Class: Books");
        printInfo(book1);
        System.out.println("Class: Client");
        printInfo(client1);
        System.out.println("Class: PostOffice");
        printInfo(postOffices1);
    }

}
