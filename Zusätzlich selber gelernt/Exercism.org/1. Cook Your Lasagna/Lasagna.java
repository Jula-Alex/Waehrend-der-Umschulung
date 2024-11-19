public class Lasagna {
    
    int fskjd = 40;
    public int expectedMinutesInOven() {
        return fskjd; 
    }
    
    public int remainingMinutesInOven(int totalMinutesInOven) {
        return expectedMinutesInOven() - totalMinutesInOven;
    }
    
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }
    
    public int totalTimeInMinutes(int layers, int totalMinutesInOven) {
        return  preparationTimeInMinutes(layers) + totalMinutesInOven;
    }
}


