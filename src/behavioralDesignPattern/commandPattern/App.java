package behavioralDesignPattern.commandPattern;

public class App {
    /*
    * Command
    * Receiver
    * invoke
    * Client
    * */
   

    //Client : Lights Turn on / Turn off
    public static void main(String[] args) {
        Light light = new Light();
        Operator operator = new Operator();
        operator.addCommand(new TurnOnLights(light));
        operator.addCommand(new TurnOffLights(light));
        operator.addCommand(new DimLights(light));
        operator.execute();
    }
}
