public class Park {

    public class Attraction {
        Attraction(String information, String time, int price) {
            this.information = information;
            this.time = time;
            this.price = price;

        }

        private String information;
        private String time;
        private int price;

        public void display() {
            System.out.println("Информация об аттракционах: " + information + " Время работы: " + time + " Цена: " + price);
        }
    }
}
