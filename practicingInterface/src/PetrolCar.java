public class PetrolCar implements CarInterface, TestInterface{
    private String name;

    public PetrolCar(String name){
        this.name = name;
    }
    @Override
    public void start() {
        System.out.println("Ignition started");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName(String name) {

    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + "moving at "+speed+"mph");
    }
}
