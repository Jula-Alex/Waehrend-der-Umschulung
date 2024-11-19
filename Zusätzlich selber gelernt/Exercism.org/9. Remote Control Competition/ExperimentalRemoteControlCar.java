public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int unitsDrived = 0;

    public void drive() {
        unitsDrived += 20;
    }

    public int getDistanceTravelled() {
        return unitsDrived;
    }
}
