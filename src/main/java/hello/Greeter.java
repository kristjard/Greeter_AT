package hello;

public class Greeter extends CounterLogic {
    public String sayHello(String name) {

        if (CounterLogic.charCounter(name)==0)
        {
            return "You didn't input anything. You alright, mate?";
        }
        /*if (CounterLogic.charDetector(name).length() > 50){
            return CounterLogic.charDetector(name);
        }*/
        else{
            return String.format("Hello, %s. Your name is %s digits long and contains %s.", name, CounterLogic.charCounter(name)/*, CounterLogic.charDetector(name)*/);
        }

        
    }
}
