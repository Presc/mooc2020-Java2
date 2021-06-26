package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensorList;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensorList.stream()
                .allMatch(Sensor::isOn);
    }

    @Override
    public void setOn() {
        this.sensorList.stream()
                .forEach(Sensor::setOn);
    }

    @Override
    public void setOff() {
        this.sensorList.stream()
                .forEach(Sensor::setOff);

    }

    @Override
    public int read() {
        if(isOn()) {
            int reading = this.sensorList.stream()
                    .map(Sensor::read)
                    .reduce(0, Integer::sum);
            this.readings.add(reading / sensorList.size());
            return reading / sensorList.size();
        } else {
            throw new IllegalStateException();
        }
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
