package DZ.DZ_1;

import java.util.ArrayList;

class VenMachHotDrink implements VendingMachine {

    private ArrayList<HotDrink> drinks;

    public void initDrinks(ArrayList<HotDrink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public HotDrink getDrink(String drinkName) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(drinkName)) {
                return drink;
            }
        }
        return null;
    }

    public Drink getDrink(String drinkName, int vol, int temperature) {
        for (HotDrink drink : drinks) {
            if (drink.getName().equals(drinkName) && drink.getVolume() == vol
                    && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}
