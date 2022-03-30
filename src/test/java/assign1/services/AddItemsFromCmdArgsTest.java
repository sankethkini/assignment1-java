package assign1.services;

import assign1.enums.ItemType;
import assign1.models.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AddItemsFromCmdArgsTest {
    @Test
    @DisplayName("add items into existing list")
    public void testRawTax(){
        List<Item> items=new ArrayList<>();
        Assertions.assertDoesNotThrow(
                ()->{
                    String[] args ={"-name","some","-price","123","-quantity","12","-type","raw"};
                    AddItemsFromCmdArgs.run(items,args);
                }
        );
        Item it=items.get(items.size()-1);
        Assertions.assertEquals("some",it.getName());
        Assertions.assertEquals((float) 123.0,it.getPrice());
        Assertions.assertEquals(12,it.getQuantity());
        Assertions.assertEquals(ItemType.RAW,it.getType());
    }
}
