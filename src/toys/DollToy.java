package toys;

public class DollToy implements toys.Toy {

    private String dollName;

    public DollToy(String name) {
        this.dollName = name;
    }

    @Override
    public void RunsWithBattery(int battery) {
        if (battery > 70) {
            System.out.println("Doll '" + dollName + "' is talking clearly with " + battery + "% battery!");
        } else if (battery > 30) {
            System.out.println("Doll '" + dollName + "' voice is getting weak with " + battery + "% battery.");
        } else {
            System.out.println("Doll '" + dollName + "' stopped talking! Battery critically low: " + battery + "%");
        }
    }
}
