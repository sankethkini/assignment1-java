package assign1.utils;

import assign1.exceptions.InvalidItemInput;
import assign1.models.Item;

import java.util.HashMap;

import static assign1.constants.ErrorMsgs.*;

public class ValidateItem {
    public static boolean validate(Item item) throws InvalidItemInput {
        if(item.getPrice()<=0){
            throw new InvalidItemInput(Invalid_price);
        }
        if (item.getQuantity()<=0){
            throw new InvalidItemInput(Invalid_quantity);
        }
        if(item.getName().length()<=0){
            throw new InvalidItemInput(Invalid_Name);
        }
        return true;
    }
}
