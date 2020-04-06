package hello;

public class Greeter extends CounterLogic {
    public String sayHello() {

        if (CounterLogic.charCounter()==0)
        {
            return "You didn't input anything. You alright, mate?";
        }
        if (CounterLogic.charDetector().length() > 50){
            return CounterLogic.charDetector();
        }
        else{
            return "Hello, " + string + ". Your name is " + CounterLogic.charCounter() + " digits long and contains "
                    + CounterLogic.charDetector() + ".";
        }

        
    }
}
