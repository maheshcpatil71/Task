package oops_oops_Unified_Smart_Home_Automation_System;

//import org.abstracts.AbstractSmartDevice;
//import org.interfaces.ISmartLight;

public class SmartLight extends AbstractSmartDevice implements ISmartLight {
    private int brightness;
    private String color;

    public SmartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

    @Override
    public void turnOn() {
        System.out.println(deviceName + " is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println(deviceName + " is turned off.");
    }

    @Override
    public void setBrightness(int level) {
        this.brightness = level;
        System.out.println(deviceName + " brightness set to " + level);
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println(deviceName + " color set to " + color);
    }
}
