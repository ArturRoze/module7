import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainForTreeSet {

    public static void main(String[] args) {

        Set<Order> orders = new TreeSet<>();

        User user1 = new User(1, "Artur", "Roze", "Vyshgorod", 10000);
        User user2 = new User(2, "Nick", "Shevchenko", "Kiev", 20000);
        User user3 = new User(3, "David", "Poroshenko", "Kharkov", 30000);
        User user4 = new User(4, "Erika", "Obida", "Dnepr", 40000);
        User user5 = new User(5, "Ann", "Borzova", "Irpen", 50000);
        User user6 = new User(6, "Victor", "Oladenko", "Vinnica", 60000);
        User user7 = new User(7, "Peter", "Govoruha", "Yalta", 70000);
        User user8 = new User(8, "Vanya", "Lapot", "Uman", 80000);
        User user9 = new User(9, "Alisa", "Petrov", "Kursk", 55555);
        User user10 = new User(10, "Victor", "Repin", "Kanev", 90000);

        orders.add(new Order(2, 200, Currency.UAH, "Umbrella", "Rozetka", user2));
        orders.add(new Order(3, 300, Currency.UAH, "T-Short", "Rozetka", user3));
        orders.add(new Order(4, 400, Currency.UAH, "Suit", "Rozetka", user4));
        orders.add(new Order(5, 500, Currency.USD, "Socks", "Rozetka", user5));
        orders.add(new Order(6, 600, Currency.USD, "Ring", "Rozetka", user6));
        orders.add(new Order(1, 100, Currency.USD, "Phone", "Rozetka", user1));
        orders.add(new Order(7, 700, Currency.USD, "Couch", "Rozetka", user7));
        orders.add(new Order(8, 800, Currency.UAH, "Pen", "Rozetka", user8));
        orders.add(new Order(9, 900, Currency.USD, "Cup", "Rozetka", user9));
        orders.add(new Order(9, 900, Currency.USD, "Cup", "Rozetka", user9));

        System.out.println("Check LastName Petrov:");
        for (Order order : orders) {
            if (order.getUser().getLastName().equals("Petrov")) {
                System.out.println(order);
            }
        }

        System.out.println("Get last element:");
        System.out.println(((TreeSet) orders).last());

        System.out.println("Remove orders with USD currency:");
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order foundOrder = iterator.next();
            if (foundOrder.getCurrency() == Currency.USD) {
                iterator.remove();
            }
        }
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
