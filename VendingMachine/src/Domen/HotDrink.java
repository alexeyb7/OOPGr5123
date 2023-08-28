package Domen;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int temperature) {
        super(name, price);
        if (temperature > 60) {
            this.temperature = temperature;
        } else {
            this.temperature = 55;
        }

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature= " + this.temperature;
    }
}
