package lessons.lections.lection4;

public class Engine {
    private double volume;
    private int horsePower;

    public Engine(double volume, int horsePower) {
        this.volume = volume;
        this.horsePower = horsePower;
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine:" +
                "volume=" + volume +
                ", horsePower=" + horsePower ;
    }
}
