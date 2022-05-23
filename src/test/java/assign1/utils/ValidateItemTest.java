package assign1.utils;

import assign1.exceptions.InvalidItemInput;
import assign1.models.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidateItemTest {
    @Test
    @DisplayName("check if name is blank")
    public void testBlankName(){

        Assertions.assertThrows(
                InvalidItemInput.class
                ,()->{
                    Item it=CreateItem.create("","raw",(float)100.0,12);
                    ValidateItem.validate(it);
                }
        );
    }
    @Test
    @DisplayName("check if type is wrong")
    public void testWrongType(){

        Assertions.assertThrows(
                InvalidItemInput.class
                ,()->{
                    Item it=CreateItem.create("name","some",(float)100.0,12);
                    ValidateItem.validate(it);
                }
        );
    }
    @Test
    @DisplayName("check if quantity less than 0")
    public void testNegativeQuantity(){

        Assertions.assertThrows(
                InvalidItemInput.class
                ,()->{
                    Item it=CreateItem.create("some","raw",(float)100.0,-2);
                    ValidateItem.validate(it);
                }
        );
    }
    @Test
    @DisplayName("check if price less than 0")
    public void testNegativePrice(){

        Assertions.assertThrows(
                InvalidItemInput.class
                ,()->{
                    Item it=CreateItem.create("some","raw",(float)-120.0,-2);
                    ValidateItem.validate(it);
                }
        );
    }
    @Test
    @DisplayName("check if everything is correct")
    public void testCorrect(){

        Assertions.assertDoesNotThrow(
                ()->{
                    Item it=CreateItem.create("some","raw",(float)120.0,2);
                    ValidateItem.validate(it);
                }
        );
    }
}
