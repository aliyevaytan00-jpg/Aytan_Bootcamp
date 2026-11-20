package sef.module10.activity;

import java.util.HashMap;

/**
 * Looks up prices of electronic items stored in a hash map.
 */
public class ElectronicItemDetails {

    /**
     * Returns the price of the named item.
     *
     * @param itemHashMap item names mapped to prices
     * @param name        the item to look up
     * @return the price, or {@code 0} when the item is missing
     */
    public double returnPriceOfItem(HashMap<String, Double> itemHashMap, String name) {
        if (itemHashMap == null || name == null || !itemHashMap.containsKey(name)) {
            return 0;
        }
        return itemHashMap.get(name);
    }

    /**
     * Stores four items and prints the price of the TV.
     *
     * @param args command-line arguments, unused
     */
    public static void main(String[] args) {
        ElectronicItemDetails details = new ElectronicItemDetails();

        HashMap<String, Double> itemHashMap = new HashMap<String, Double>();
        itemHashMap.put("TV", 799.99);
        itemHashMap.put("Refrigerator", 1199.50);
        itemHashMap.put("Washing Machine", 649.00);
        itemHashMap.put("Laptop", 1499.99);

        System.out.println("Price of TV is " + details.returnPriceOfItem(itemHashMap, "TV"));
    }
}
