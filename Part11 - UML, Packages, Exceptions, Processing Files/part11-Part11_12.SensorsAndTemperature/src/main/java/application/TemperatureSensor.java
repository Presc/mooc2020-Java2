package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean state = false;

    public TemperatureSensor() {

    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void setOn() {
        this.state = true;
    }

    @Override
    public void setOff() {
        this.state = false;
    }

    @Override
    public int read() {
        if (!this.isOn()) {
            throw new IllegalStateException();
        }
        int sensorValue = new Random().nextInt(61) - 30;
        return sensorValue;
    }
}
