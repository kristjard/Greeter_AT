package hello;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CounterLogicTest {
    CounterLogic counter = new CounterLogic();


    @Test
    public void char_counter_test() {
        String name = "Kristjan";
        int expectedResult = 8;
        assertEquals(expectedResult, counter.charCounter(name));
    }
    @Test
    public  void empty_string_test(){
        String name = "";
        int expectedResult = 0;
        assertEquals(expectedResult,counter.charCounter(name));
    }
    @Test
    public  void ridiculously_long_string_test(){
        String name = "";

        for(int i = 0; i < 100000; i++){
            name = name.concat("a");
        }
        int expectedResult = 100000;
        assertEquals(expectedResult,counter.charCounter(name));
    }
    @Test
    public void can_detect_letters(){
        String name = "aaa";
        String expectedResult = "only letters";
        assertEquals(expectedResult, counter.charDetector(name));
    }
    @Test
    public void can_detect_numbers(){
        String name = "111";
        String expectedResult = "numbers";
        assertEquals(expectedResult, counter.charDetector(name));
    }
    @Test
    public void can_detect_special_chars(){
        String name = "!!!";
        String expectedResult = "special characters";
        assertEquals(expectedResult, counter.charDetector(name));
    }
    @Test
    public void can_detect_special_chars_and_numbers(){
        String name = "111!!!";
        String expectedResult = "special characters and numbers";
        assertEquals(expectedResult, counter.charDetector(name));
    }
    @Test
    public void can_detect_a_space_character_in_the_string(){
        String name = "111 !!!";
        String expectedResult = "No empty spaces allowed, try and use only one name. Or if you insist on using more" +
                " than one, try using an underscore, maybe??";
        assertEquals(expectedResult, counter.charDetector(name));
    }

}
