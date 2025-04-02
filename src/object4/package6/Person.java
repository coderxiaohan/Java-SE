package object4.package6;

public class Person implements Cloneable{

    private int id;
    private Money money = new Money();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.money = p.money.clone();
        return p;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        p1.id = 1;
        p1.money.setAmount(10000);

        Person p2 = p1.clone();

        // 修改p2的值
        p2.money.setAmount(2000);
        System.out.println(p1.money.getAmount());
        System.out.println(p2.money.getAmount());
        System.out.println(p1 == p2);
        System.out.println(p1.money == p2.money);
    }
}
