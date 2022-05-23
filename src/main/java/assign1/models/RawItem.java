package assign1.models;

import assign1.enums.ItemType;

import static assign1.constants.ItemTax.rawTax;

public class RawItem extends Item{
    public RawItem(String name, Float price, Integer quantity, ItemType type) {
        super(name, price, quantity, type);
    }

    @Override
    public Float calculateTax() {
        return this.getPrice()+this.getPrice()*rawTax;
    }
}
