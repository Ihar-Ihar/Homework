public class Product {

    Product(String name, String date, String manufacturer, String country, int price, boolean isBooked) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    private String name;
    private String date;
    private String manufacturer;
    private String country;
    private int price;
    private boolean isBooked;

    public void display() {
        System.out.println("Название: " + name + " Дата производства: " + date + " Производитель: " + manufacturer
                + " Страна происхождения: " + country + " Цена: " + price + " Состояние бронирования покупателем: " + isBooked);
    }
}
