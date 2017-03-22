package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine;

/**
 * Created by Dell on 02/03/2017.
 */

public class Automobile extends Machine {
    private String color;
    private int wheels;

    public Automobile(){
        color = "unknown";
        wheels = 4;
    }

    public Automobile(String color, int wheels, String manufacturer, int weight){
        super(manufacturer, weight);
        this.color = color;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels){
        if (wheels>0){
            this.wheels = wheels;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString(){
        return String.format("Automobile %s color: %s wheels: %d",super.toString(), color, wheels);
    }
}
