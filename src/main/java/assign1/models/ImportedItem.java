package assign1.models;

import assign1.enums.ItemType;

import static assign1.constants.ItemTax.*;

public class ImportedItem extends Item{

    public ImportedItem(String name, Float price, Integer quantity, ItemType type) {
        super(name, price, quantity, type);
    }

    @Override
    public Float calculateTax() {
        Float price=this.getPrice();
        price=price+importTax*price;
        if(price<=100){
            price+=importSurcharge100;
        } else if(price<=200){
            price+=importSurcharge200;
        } else {
            price+=price*importSurchargeMore;
        }
        return price;
    }
}
