package behavioralDesignPattern.commandPattern;

public class Light {
    public void TurnOnLights(){
        System.out.println("Lights are ON");
    }

    public void TurnOffLights(){
        System.out.println("Lights are off");
    }

    public void dimLights(){
        System.out.println("Lights are dimmed");
    }
}
