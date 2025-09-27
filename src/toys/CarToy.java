package toys;

public class CarToy implements toys.Toy {

    private String carName;

    public CarToy(String name) {
        this.carName = name;
    }

    @Override
    public void RunsWithBattery(int battery) {
        if (battery > 50) {
            System.out.println("Car Toy '" + carName + "' is running smoothly with " + battery + "% battery!");
        } else if (battery > 20) {
            System.out.println("Car Toy '" + carName + "' is running slowly with " + battery + "% battery remaining.");
        } else {
            System.out.println("Car Toy '" + carName + "' needs battery replacement! Only " + battery + "% left.");
        }
    }
}
