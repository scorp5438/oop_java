package DZ.DZ_1;

public class Drink {
    protected String name;
    protected int volume;

    public Drink() {

    }

    public Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("Напиток %s, объемом %d", name, volume);
    }

}
