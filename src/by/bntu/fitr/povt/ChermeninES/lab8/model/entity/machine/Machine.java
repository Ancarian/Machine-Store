package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.machine;

/**
 * Created by Dell on 02/03/2017.
 */
public class Machine implements Comparable<Object> {
    private String manufacturer;
    private int weight;

    public Machine() {
        manufacturer = "unknown";
        weight = 1000;
    }

    public Machine(String name, int weight) {
        manufacturer = name;
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Machine aircraft = (Machine) o;

        return manufacturer.equals(aircraft.getManufacturer());
    }


    @Override
    public int hashCode() {
        System.out.println("hashCode");
        int result = manufacturer != null ? manufacturer.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public int compareTo(Object obj) {

        Machine entry = (Machine) obj;

        if (manufacturer.compareTo(entry.manufacturer) != 0)
            return manufacturer.compareTo(entry.getManufacturer());

        int result = weight - entry.getWeight();
        if (result != 0)
            return (int) result / Math.abs(result);

        return 0;
    }

    public String toString() {
        return String.format("Machine manufacturer: %s weigth: %d", manufacturer, weight);
    }

    public enum Manufacturers {
        LADA,
        SHKONDA,
        MAZDA,
        BMW,
        MERCEDES;

        @Override
        public String  toString(){
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

}


