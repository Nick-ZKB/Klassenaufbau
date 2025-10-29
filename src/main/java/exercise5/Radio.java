package exercise5;

public class Radio {
    private boolean isOn;
    private int volume;
    private double frequency;

    public Radio(boolean isOn, int volume, double frequency) {
        this.isOn = isOn;
        this.volume = volume;
        this.frequency = frequency;
    }
    public void on() {
        isOn = true;
    }
    public void off() {
        isOn = false;
    }
    public void increaseVolume() {
        volume++;
    }
    public void decreaseVolume() {
        volume--;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getVolume() {
        return volume;
    }


    public double getFrequency() {
        return frequency;
    }


    public void selectChannel(double frequency) {
        this.frequency = frequency;
    }
    @Override
    public String toString() {
        return "is On: " + isOn + ", volume: " + volume + ", frequency: " + frequency;
    }
}