package assign1.utils;

import assign1.constants.Display;
import assign1.enums.ItemType;
import assign1.exceptions.InvalidItemInput;
import assign1.models.ImportedItem;
import assign1.models.Item;
import assign1.models.ManufacturedItem;
import assign1.models.RawItem;

public class CreateItem {
    public static Item create(String name,String type,Float price,Integer quantity) throws InvalidItemInput {
        switch (type){
            case Display.raw:
                return new RawItem(name,price,quantity, ItemType.RAW);
            case Display.manufactured:
                return new ManufacturedItem(name,price,quantity,ItemType.MANUFACTURED);
            case Display.imported:
                return new ImportedItem(name,price,quantity,ItemType.IMPORTED);
            default:
                throw new InvalidItemInput("invalid item type");
        }
    }
}
