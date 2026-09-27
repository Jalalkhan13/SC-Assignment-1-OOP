public class SmartThermostat implements SmartDevice {

    private boolean on;
    private double temperature;

    public SmartThermostat() {
        on = false;
        temperature = 22.0;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public String getStatus() {
        if (on) {
            return "Smart Thermostat is ON at "
                    + temperature + "°C";
        } else {
            return "Smart Thermostat is OFF";
        }
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }
}