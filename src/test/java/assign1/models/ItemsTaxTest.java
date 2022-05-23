package assign1.models;

import assign1.exceptions.InvalidItemInput;
import assign1.utils.CreateItem;
import assign1.utils.ValidateItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItemsTaxTest {
    @Test
    @DisplayName("check total price of raw")
    public void testRawTax(){
        Item it = null;
        try {
            it=CreateItem.create("some","raw",(float)100.0,12);
        } catch (Exception e){
            Assertions.assertNull(e);
        }
        Float val=it.calculateTax();
        Assertions.assertEquals((float) 112.5,val);
    }
    
    @Test
    @DisplayName("check total price of manufactured")
    public void testManufacturedTax(){
        Item it = null;
        try {
            it=CreateItem.create("some","manufactured",(float)100.0,12);
        } catch (Exception e){
            Assertions.assertNull(e);
        }
        Float val=it.calculateTax();
        Assertions.assertEquals((float) 114.75,val);
    }

    @Test
    @DisplayName("check total price of imported item less than 100")
    public void testImportedTaxLT100(){
        Item it = null;
        try {
            it=CreateItem.create("some","imported",(float)80.0,12);
        } catch (Exception e){
            Assertions.assertNull(e);
        }
        Float val=it.calculateTax();
        Assertions.assertEquals((float) 93,val);
    }

    @Test
    @DisplayName("check total price of imported item less than 200")
    public void testImportedTaxLT200(){
        Item it = null;
        try {
            it=CreateItem.create("some","imported",(float)150.0,12);
        } catch (Exception e){
            Assertions.assertNull(e);
        }
        Float val=it.calculateTax();
        Assertions.assertEquals((float) 175,val);
    }

    @Test
    @DisplayName("check total price of imported item more")
    public void testImportedTaxMore(){
        Item it = null;
        try {
            it=CreateItem.create("some","imported",(float)250.0,12);
        } catch (Exception e){
            Assertions.assertNull(e);
        }
        Float val=it.calculateTax();
        Assertions.assertEquals((float) 288.75,val);
    }
}
