package assign1.services;

import assign1.constants.Display;
import assign1.enums.ItemType;
import assign1.exceptions.InvalidItemInput;
import assign1.models.ImportedItem;
import assign1.models.Item;
import assign1.models.ManufacturedItem;
import assign1.models.RawItem;
import assign1.utils.CreateItem;
import assign1.utils.ValidateItem;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddItemsInteractive {

    public static void run(List<Item> items,Scanner sc) throws InvalidItemInput{
        System.out.println(Display.line);
        System.out.println("Enter the name of the item");
        String name=sc.next();
        System.out.println("Enter the price of the item");
        Float price=sc.nextFloat();
        System.out.println("Enter the quantity of the item");
        Integer quantity=sc.nextInt();
        System.out.println("Enter the type "+Display.raw+" , "+Display.imported+" , "+Display.manufactured);
        String type=sc.next();
        System.out.println(Display.line);
        addItem(
                name,
                price,
                quantity,
                type,
                items
        );
    }

    public static void addItem(String name,Float price,Integer quantity,String type,List<Item> items) throws InvalidItemInput{
        Item item= CreateItem.create(name,type,price,quantity);
        ValidateItem.validate(item);
        items.add(item);
    }

}
