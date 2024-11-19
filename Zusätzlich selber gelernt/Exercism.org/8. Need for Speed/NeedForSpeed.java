class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        battery = 100; 
    }

    public boolean batteryDrained() {
        return !((battery - batteryDrain) >= 0);
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(battery - batteryDrain >= 0) {
            battery -= batteryDrain;
            distanceDriven += speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    } 

    public int getBattery() {
        return battery;
    }

    public static NeedForSpeed nitro() {
        int speed = 50;
        int batteryDrain = 4;
        return new NeedForSpeed(speed, batteryDrain);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return ((car.getBattery() / car.getBatteryDrain()) * car.getSpeed()) >= distance;
    }
}
