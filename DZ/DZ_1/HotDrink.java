package DZ.DZ_1;

public class HotDrink extends Drink {
    protected int temperature;

    public HotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }

    public HotDrink(String name, int volume) {
        this(name, volume, 100);
    }

    public HotDrink(String name) {
        this(name, 250, 100);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("Напиток %s, объемом %d, температура %d", this.name, this.volume, this.temperature);
    }
}
