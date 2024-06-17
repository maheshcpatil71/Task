package oops_oops_Unified_Smart_Home_Automation_System;

//import org.interfaces.ISmartDevice;

public abstract class AbstractSmartDevice implements ISmartDevice {
    protected String deviceId;
    protected String deviceName;

    public AbstractSmartDevice(String deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    @Override
    public String getDeviceId() {
        return deviceId;
    }

    @Override
    public String toString() {
        return deviceName + " (" + deviceId + ")";
    }
}

