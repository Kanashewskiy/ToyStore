public class Toy {
    private int id;
    private String name;
    private double counter;

    public Toy(int id, String name, double counter){
        this.id = id;
        this.name = name;
        this.counter = counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCounter() {
        return counter;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCounter(double counter) {
        this.counter = counter;
    }
}
