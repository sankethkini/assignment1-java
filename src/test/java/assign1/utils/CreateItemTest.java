package assign1.utils;

import assign1.exceptions.InvalidItemInput;
import assign1.models.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateItemTest {
    @Test
    @DisplayName("check if type is raw")
    public void testTypeRaw(){
        Assertions.assertDoesNotThrow( ()->{
                     CreateItem.create("some","raw",(float)100.0,12);
                }
        );
    }
    @Test
    @DisplayName("check if type is manufactured")
    public void testTypeManufactured(){
        Assertions.assertDoesNotThrow( ()->{
                    CreateItem.create("some","manufactured",(float)100.0,12);
                }
        );
    }
    @Test
    @DisplayName("check if type is imported")
    public void testTypeImported(){
        Assertions.assertDoesNotThrow( ()->{
                    CreateItem.create("some","imported",(float)100.0,12);
                }
        );
    }

    @Test
    @DisplayName("check if type is wrong")
    public void testWrongType(){
        Assertions.assertThrows(
                InvalidItemInput.class
                ,()->{
                    CreateItem.create("some","some",(float)100.0,12);
                }
        );
    }

}
