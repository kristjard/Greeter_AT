package hello;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;



public class GreeterTest
{
    @Mock
    private CounterLogic counter;

    @InjectMocks
    Greeter greeter = new Greeter();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void counts_correctly(){ //proovin testida kas charCounter töötab õigesti.
        //Given
        when(counter.charCounter("Kristjan")).thenReturn(8);
        //When

        String result=greeter.sayHello("Kristjan");
        //then
        assertEquals("tere", result);


    }










}