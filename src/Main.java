import toys.DollToy;
import toys.Toy;
import toys.CarToy;
import adapter.BatteryAdapter;
import remotecont.RemoteController;

public class Main {
    public static void main(String[] args) {

        Toy car = new CarToy("Race Car");
        car.RunsWithBattery(80);

        Toy doll = new DollToy("Barbie");
        doll.RunsWithBattery(100);

        Toy remote = new BatteryAdapter(new RemoteController());
        remote.RunsWithBattery(80);
    }
}