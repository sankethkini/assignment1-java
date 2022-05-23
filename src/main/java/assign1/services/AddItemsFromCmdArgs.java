package assign1.services;

import assign1.exceptions.InvalidItemInput;
import assign1.models.Item;
import assign1.utils.CreateItem;
import assign1.utils.ParseArgs;
import org.apache.commons.cli.ParseException;

import java.util.HashMap;
import java.util.List;

public class AddItemsFromCmdArgs {
    public static void run(List<Item> items, String[] args) throws ParseException, InvalidItemInput {

        HashMap<String,String> map= ParseArgs.parse(args);
        Item item=CreateItem.create(
                map.get("name"),
                map.get("type"),
                Float.parseFloat(map.get("price")),
                Integer.parseInt(map.get("quantity")));

        items.add(item);
    }
}
