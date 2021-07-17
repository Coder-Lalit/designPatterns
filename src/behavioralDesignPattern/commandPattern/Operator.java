package behavioralDesignPattern.commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Operator {

    List<Command> commandList;
    public Operator() {
        this.commandList = new ArrayList<>();
    }
     public void addCommand(Command c){
        commandList.add(c);
     }

    public void execute(){
        commandList.forEach(c->{
            c.execute();
        });
    }


}
