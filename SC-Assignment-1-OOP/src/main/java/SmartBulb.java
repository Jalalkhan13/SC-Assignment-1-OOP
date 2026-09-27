public class SmartBulb implements SmartDevice {

    private boolean on;
    private int brightness;

    public SmartBulb() {
        on = false;
        brightness = 50;
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
            return "Smart Bulb is ON at " + brightness + "% brightness";
        } else {
            return "Smart Bulb is OFF";
        }
    }

    public void setBrightness(int level) {

        if (level < 0 || level > 100) {
            throw new IllegalArgumentException(
                    "Brightness must be between 0 and 100."
            );
        }

        brightness = level;
    }
}