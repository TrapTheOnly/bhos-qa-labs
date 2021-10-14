import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class classroomTest {
    @Test
    void checks(){
        classroom tests = new classroom();
        Assertions.assertEquals(1, tests.KnowIt("Yes I know"));
        Assertions.assertEquals("Such a nerd!", tests.HelloNerd(135));
        Assertions.assertEquals(31, tests.LMAO("Dif"));
        Assertions.assertEquals(100, tests.Wassup(0));
        Assertions.assertEquals(10e9, tests.ShoppingListPrice(new String[] {"Chestnut", "Carrot"}));
    }
}
