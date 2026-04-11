package task1;

public class Bowl {
    private int food;

    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        if (food < 0) {
            System.out.println("значение должно быть положительным");
        } else {
            this.food += food;
        }
    }

    public void eatFood(int food) {
        this.food -= food;
    }
}