public class CarsAssemble {
    private double cars = 221;

    public double productionRatePerHour(int speed) {
        if(speed <= 4)
            cars *= speed;
        else if(speed <= 8)
            cars = (speed * cars) * 0.9;
        else if(speed == 9) 
            cars = (speed * cars) * 0.8;
        else
            cars = (speed * cars) * 0.77;
        return cars;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
