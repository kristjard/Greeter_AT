package hello;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;



@RunWith(MockitoJUnitRunner.class)
public class GreeterTest
{   String userName = "Kristjan";
    @InjectMocks
    Greeter greeter = new Greeter();

    @Mock
    CounterLogic counterLogicMock;

    @Mock
    GetInput getInputMock;

    @Test
    public void testInput()
    {

        when(getInputMock.getInput()).thenReturn(userName);
        assertThat(getInputMock.getInput(), containsString("Kristjan"));



    }
}