public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Honor x12", "27.02.2023",
                "Honor Corp.", "China", 1200, true);
        productsArray[2] = new Product("Iphone 17", "23.01.2025",
                "Apple Corp.", "USA", 4980, false);
        productsArray[3] = new Product("LG SX 21", "24.11.2024",
                "LG Group.", "Korea", 3211, true);
        productsArray[4] = new Product("Xiaomi ", "12.07.2025",
                "Xiaomi group.", "China", 4799, false);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].display();
        }

        Park myPark = new Park();
        Park.Attraction[] attractions = new Park.Attraction[3];
        attractions[0] = myPark.new Attraction("Колесо обозрения", "8:00 AM – 6:00 PM", 220);
        attractions[1] = myPark.new Attraction("Амереканские горки", "8:00 AM – 6:00 PM", 120);
        attractions[2] = myPark.new Attraction("Автодром", "8:00 AM – 6:00 PM", 330);

        for (int i = 0; i < attractions.length; i++) {
            attractions[i].display();
        }
    }
}
