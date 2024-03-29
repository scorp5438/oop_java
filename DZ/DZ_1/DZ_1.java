package DZ.DZ_1;

import java.util.ArrayList;

public class DZ_1 {
    public static void main(String[] args) {

        // HotDrink dr = new HotDrink("Tea", 150, 90);
        // HotDrink dr2 = new HotDrink("Tea", 150);
        // HotDrink dr3 = new HotDrink("Tea");

        // System.out.println(dr);
        // System.out.println(dr2);
        // System.out.println(dr3);

        ArrayList<HotDrink> drinks = new ArrayList<>();

        drinks.add(new HotDrink("coffee", 250, 80));
        drinks.add(new HotDrink("coffee", 350, 85));
        drinks.add(new HotDrink("coffee", 450, 90));
        drinks.add(new HotDrink("tea", 250, 70));
        drinks.add(new HotDrink("tea", 350, 70));
        drinks.add(new HotDrink("tea", 450, 70));

        VenMachHotDrink venMachHotDrink = new VenMachHotDrink();
        venMachHotDrink.initDrinks(drinks);
        System.out.println(venMachHotDrink.getDrink("coffee", 350, 85));
    }
}
