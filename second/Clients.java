package second;

public class Clients {

    static final int number = 123;
    private String name;
    private int age;
    private String gender;
    private boolean bonusCard;
    private double money;

    public static int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isBonusCard() {
        return bonusCard;
    }

    public void isBonusCard(boolean b) {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
