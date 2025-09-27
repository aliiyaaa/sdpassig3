package adapter;
import toys.Toy;
import remotecont.RemoteController;

public class BatteryAdapter implements Toy {
    private RemoteController controller;

    public BatteryAdapter(RemoteController controller) {
        this.controller = controller;
    }

    @Override
    public void RunsWithBattery(int battery) {
        controller.WorkingWithBattery(battery);
    }
}

