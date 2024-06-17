package oops_oops_Unified_Smart_Home_Automation_System;

//import org.abstracts.AbstractSmartDevice;
//import org.interfaces.ISmartDevice;

public class SmartThermostat extends AbstractSmartDevice implements ISmartDevice {
    public SmartThermostat(String deviceId, String deviceName) {
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
}
