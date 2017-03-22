public class Order implements Comparable {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentifier;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentifier, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentifier = shopIdentifier;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentifier() {
        return shopIdentifier;
    }

    public void setShopIdentifier(String shopIdentifier) {
        this.shopIdentifier = shopIdentifier;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        if (shopIdentifier != null ? !shopIdentifier.equals(order.shopIdentifier) : order.shopIdentifier != null)
            return false;
        return user != null ? user.equals(order.user) : order.user == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (shopIdentifier != null ? shopIdentifier.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentifier='" + shopIdentifier + '\'' +
                ", user=" + user +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Order){
            return this.getPrice() - ((Order) o).getPrice();
        }
        throw new IllegalArgumentException("We cannot compare Order with " + o.getClass().getName());
    }
}
