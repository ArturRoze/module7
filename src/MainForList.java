import java.util.*;

public class MainForList {

    public static void main(String[] args) {

        System.out.println("Sorting orders decrease price:");
        List<Order> basicList1 = basicList();
        sortOrdersDecreasePrice(basicList1);

        System.out.println("Sorting orders increase price:");
        List<Order> basicList2 = basicList();
        sortOrdersIncreasePriceAndCityOfUser(basicList2);

        System.out.println("Sorting orders itemName, shopIdentifier and cityOfUser:");
        List<Order> basicList3 = basicList();
        sortOrdersItemNameShopIdentifierCityOfUser(basicList3);

        System.out.println("Unique elements from list:");
        List<Order> basicList4 = basicList();
        getUniqueOrdersFromList(basicList4);

        System.out.println("Remove orders with price < 1500:");
        List<Order> basicList5 = basicList();
        removeOrdersWithPriceLessThan1500(basicList5);

        System.out.println("Divide orders by currency:");
        List<Order> basicList6 = basicList();
        divideOrdersByCurrency(basicList6);

        System.out.println("Show map of unique cities:");
        List<Order> basicList7 = basicList();
        getCityUserMap(basicList7);
    }

    public static List<Order> sortOrdersDecreasePrice(List<Order> orders) {
        if (orders == null) {
            System.out.println("Nothing sort");
            return null;
        }
        // use Java 7 =====================================================
//        Collections.sort(orders, new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                return o2.getPrice() - o1.getPrice();
//            }
//        });
//        for (Order order : orders) {
//            System.out.println(order);
//        }
//
//        return orders;
//    }

        // use Java 8 =====================================================
        Collections.sort(orders, (o1, o2) -> o2.getPrice() - o1.getPrice());
        orders.forEach(System.out::println);
        return orders;
    }

    public static List<Order> sortOrdersIncreasePriceAndCityOfUser(List<Order> orders) {
        if (orders == null) {
            System.out.println("Nothing sort");
            return null;
        }
        // use Java 7 =====================================================
//        Collections.sort(orders, new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                int compared = o1.getPrice() - o2.getPrice();
//                if (compared == 0) {
//                    compared = o1.getUser().getCity().compareTo(o2.getUser().getCity());
//                }
//                return compared;
//            }
//        });
//        for (Order ord : orders) {
//            System.out.println(ord);
//        }
//        return orders;
//    }

        // use Java 8 =====================================================
        Collections.sort(orders, (o1, o2) -> {
            int compared = o1.getPrice() - o2.getPrice();
            if (compared == 0) {
                compared = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return compared;
        });
        orders.forEach(System.out::println);
        return orders;
    }

    public static List<Order> sortOrdersItemNameShopIdentifierCityOfUser(List<Order> orders) {
        if (orders == null) {
            System.out.println("Nothing sort");
            return null;
        }
        // use Java 7 =====================================================
//        Collections.sort(orders, new Comparator<Order>() {
//            @Override
//            public int compare(Order o1, Order o2) {
//                int compared = o1.getItemName().compareTo(o2.getItemName());
//                if (compared == 0) {
//                    compared = o1.getShopIdentifier().compareTo(o2.getShopIdentifier());
//                }
//                if (compared == 0) {
//                    compared = o1.getUser().getCity().compareTo(o2.getUser().getCity());
//                }
//                return compared;
//            }
//        });
//        for (Order ord : orders) {
//            System.out.println(ord);
//        }
//        return orders;
//    }
        // use Java 8 =====================================================
        Collections.sort(orders, (o1, o2) -> {
            int compared = o1.getItemName().compareTo(o2.getItemName());
            if (compared == 0) {
                compared = o1.getShopIdentifier().compareTo(o2.getShopIdentifier());
            }
            if (compared == 0) {
                compared = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return compared;
        });
        orders.forEach(System.out::println);
        return orders;
    }

    public static Set<Order> getUniqueOrdersFromList(List<Order> orders) {
        if (orders == null) {
            System.out.println("Nothing sort");
            return null;
        }
        Set<Order> uniqueElements = new HashSet<>(orders);
        // use Java 7 =====================================================
//        for (Order uniqueElement : uniqueElements) {
//            System.out.println(uniqueElement);
//        }
//        return uniqueElements;
//    }

        // use Java 8 =====================================================
        uniqueElements.forEach(System.out::println);
        return uniqueElements;
    }

    public static List<Order> removeOrdersWithPriceLessThan1500(List<Order> orders) {
        if (orders == null) {
            System.out.println("Nothing sort");
            return null;
        }
        // use Java 7 =====================================================
//        Iterator<Order> iterator = orders.iterator();
//        while (iterator.hasNext()) {
//            Order nextElement = iterator.next();
//            if (nextElement.getPrice() < 1500) {
//                iterator.remove();
//            }
//        }

        // use Java 8 =====================================================
        orders.removeIf(order -> order.getPrice() < 1500);
        orders.forEach(System.out::println);
        return orders;
    }

    public static List<Order> divideOrdersByCurrency(List<Order> orders) {
        if (orders == null) {
            System.out.println("Nothing sort");
            return null;
        }
        List<Order> ordersWithUah = new ArrayList<>();
        List<Order> ordersWithUsd = new ArrayList<>();
        // use Java 7 =====================================================
//        for (int i = 0; i < orders.size(); i++) {
//            if (orders.get(i).getCurrency() == Currency.UAH ? ordersWithUah.add(orders.get(i))
//                    : ordersWithUsd.add(orders.get(i)));
//        }
//        System.out.println("Orders with UAH:");
//        for (Order ord : ordersWithUah) {
//            System.out.println(ord);
//        }
//        System.out.println("Orders with USD:");
//        for (Order ord : ordersWithUsd) {
//            System.out.println(ord);
//        }
//        return orders;
//    }

        // use Java 8 =====================================================
        orders.stream().filter(s -> s.getCurrency() == Currency.UAH).forEach(ordersWithUah::add);
        orders.stream().filter(s -> s.getCurrency() == Currency.USD).forEach(ordersWithUsd::add);

        System.out.println("Orders with UAH:");
        ordersWithUah.forEach(System.out::println);
        System.out.println("Orders with USD:");
        ordersWithUsd.forEach(System.out::println);
        return orders;
    }
        // use Java 8 =====================================================
    public static Map<String, List<Order>> getCityUserMap(List<Order> orders) {
        Map<String, List<Order>> cityUserMap = new HashMap<>();
        orders.forEach(order -> {
            String key = order.getUser().getCity();
            if (!cityUserMap.containsKey(key)) {
                List<Order> usersCity = new ArrayList<>();
                usersCity.add(order);
                cityUserMap.put(key, usersCity);
            } else {
                cityUserMap.get(key).add(order);
            }
        });
        cityUserMap.entrySet().forEach(cities -> {
            System.out.print("city: " + cities.getKey() + " -> users: ");
            cities.getValue().forEach(order -> {
                System.out.print(order.getUser().getFirstName() + " " + order.getUser().getLastName() + " ");
            });
            System.out.println();
        });
        return cityUserMap;
    }

    public static List<Order> basicList() {
        List<User> users = new ArrayList<>();
        List<Order> orders = new ArrayList<>();

        users.add(new User(1, "Artur", "Roze", "Vyshgorod", 10000));
        users.add(new User(2, "Nick", "Shevchenko", "Kiev", 20000));
        users.add(new User(3, "David", "Poroshenko", "Kharkov", 30000));
        users.add(new User(4, "Erika", "Obida", "Dnepr", 40000));
        users.add(new User(5, "Ann", "Borzova", "Irpen", 50000));
        users.add(new User(6, "Victor", "Oladenko", "Vinnica", 60000));
        users.add(new User(7, "Peter", "Govoruha", "Yalta", 70000));
        users.add(new User(8, "Vanya", "Lapot", "Uman", 80000));
        users.add(new User(9, "Victor", "Repin", "Kanev", 90000));
        users.add(new User(10, "Alisa", "Petrov", "Kursk", 55555));

        orders.add(new Order(1, 100, Currency.USD, "Phone", "Rozetka", users.get(0)));
        orders.add(new Order(2, 200, Currency.UAH, "Phone", "Ski-line", users.get(1)));
        orders.add(new Order(3, 300, Currency.UAH, "Phone", "Rozetka", users.get(2)));
        orders.add(new Order(4, 400, Currency.UAH, "Phone", "Rozetka", users.get(3)));
        orders.add(new Order(5, 500, Currency.USD, "Socks", "Scooter", users.get(4)));
        orders.add(new Order(6, 800, Currency.USD, "Ring", "Rozetka", users.get(5)));
        orders.add(new Order(7, 800, Currency.USD, "Couch", "Mama-Market", users.get(6)));
        orders.add(new Order(8, 2000, Currency.UAH, "Pen", "Rozetka", users.get(7)));
        orders.add(new Order(10, 555, Currency.UAH, "Marker", "Rozetka", users.get(8)));
        orders.add(new Order(10, 555, Currency.UAH, "Marker", "Rozetka", users.get(8)));
        return orders;
    }
}
