package oops_oops_Unified_Smart_Home_Automation_System;

//import org.abstracts.AbstractSmartDevice;
//import org.interfaces.ISmartCamera;

public class SmartCamera extends AbstractSmartDevice implements ISmartCamera {
    private boolean recording;

    public SmartCamera(String deviceId, String deviceName) {
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
    public void startRecording() {
        this.recording = true;
        System.out.println(deviceName + " recording started.");
    }

    @Override
    public void stopRecording() {
        this.recording = false;
        System.out.println(deviceName + " recording stopped.");
    }
}
