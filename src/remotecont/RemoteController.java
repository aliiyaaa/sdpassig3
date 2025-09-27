package remotecont;

public class RemoteController {

    public void WorkingWithBattery(int battery) {
        if (battery < 100) {
            System.out.println("Remote Controller: Battery is lower than 100% and right now is " + battery + "%");
        } else {
            System.out.println("Remote Controller: Battery is at  " + battery + "%");
        }
    }
}