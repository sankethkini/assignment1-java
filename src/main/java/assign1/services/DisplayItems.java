package assign1.services;

import assign1.models.Item;

import java.util.List;
import assign1.constants.Display;

public class DisplayItems {
    public static void run(List<Item> items){
        System.out.println(Display.line);
        for(Item item:items){
            System.out.println(
                    "name: "+item.getName()+" total price: "+Float.toString(item.calculateTax())
                    +" quantity: "+Integer.toString(item.getQuantity())+" type: "+item.getType()
            );
        }
        System.out.println(Display.line);
    }
}
