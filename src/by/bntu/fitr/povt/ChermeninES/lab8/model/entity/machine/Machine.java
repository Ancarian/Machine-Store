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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        else if (o == null || getClass() != o.getClass()) return false;
        else if (!this.getManufacturer().equals(((Machine) o).getManufacturer())) return false;
        else return this.getWeight() == ((Machine) o).getWeight();
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

    public static enum Manufacturer {
        SHKONDA("Shkonda"),
        BMW("Bmw"),
        MERCEDES("Mercedes"),
        OTHER("Other");

        private String name;

        private Manufacturer(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name().charAt(0) + name().substring(1).toLowerCase();
        }
    }

}


