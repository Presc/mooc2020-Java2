package application;

public class StandardSensor implements Sensor {

    private int sensorValue;

    public StandardSensor(int sensorValue) {
        this.sensorValue = sensorValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return this.sensorValue;
    }
}
