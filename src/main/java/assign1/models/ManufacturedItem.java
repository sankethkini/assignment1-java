package assign1.models;

import assign1.enums.ItemType;

import static assign1.constants.ItemTax.*;


public class ManufacturedItem extends Item{
    public ManufacturedItem(String name, Float price, Integer quantity, ItemType type) {
        super(name, price, quantity, type);
    }
    @Override
    public Float calculateTax() {
        Float price=this.getPrice();
        price=price+manfTax*price;
        price=price+manfExtra*price;
        return price;
    }
}
