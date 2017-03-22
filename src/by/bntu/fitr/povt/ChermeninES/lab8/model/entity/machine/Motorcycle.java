package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine;

/**
 * Created by Dell on 02/03/2017.
 */
public class Motorcycle extends Machine{
    private int power;


    public Motorcycle(){
        power = 100;
    }

    public Motorcycle(int power, String manufacturer, int weight){
        super(manufacturer, weight);
        this.power = power;
    }

    public void setPower(int power){
        if (power>0){
            this.power = power;
        }
        else{
            throw new IndexOutOfBoundsException();
        }
    }

    public int getPower(){
        return power;
    }

    public String toString(){
        return String.format("Motorcycle %s power: %d",super.toString(), power);
    }
}
