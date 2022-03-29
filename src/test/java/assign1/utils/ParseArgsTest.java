package assign1.utils;

import assign1.exceptions.InvalidItemInput;
import org.apache.commons.cli.MissingOptionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

public class ParseArgsTest {
    @Test
    @DisplayName("check if name is missing")
    public void checkIfNameIsMissing(){
        String args[]={"-price","100","-quantity","10","-type","raw"};
        Assertions.assertThrows(
                MissingOptionException.class,
                ()->{
                    ParseArgs.parse(args);
                }
        );
    }

    @Test
    @DisplayName("check if everything is correct")
    public void checkIfCorrect(){
        String args[]={"-name","some","-price","100","-quantity","10","-type","raw"};
        Assertions.assertDoesNotThrow(
                ()->{
                    ParseArgs.parse(args);
                }
        );
    }
}
