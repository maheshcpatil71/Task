package oops_oops_Unified_Smart_Home_Automation_System;

//import org.interfaces.ISmartDevice;
//import org.interfaces.ISmartLight;
//import org.interfaces.ISmartCamera;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<ISmartDevice> devices;

    public SmartHomeController() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(ISmartDevice device) {
        devices.add(device);
        System.out.println(device + " added.");
    }

    public void turnAllOn() {
        for (ISmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        for (ISmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void setLightBrightness(String lightId, int brightness) {
        for (ISmartDevice device : devices) {
            if (device instanceof ISmartLight) {
                ISmartLight light = (ISmartLight) device;
                if (light.getDeviceId().equals(lightId)) {
                    light.setBrightness(brightness);
                    return;
                }
            }
        }
        System.out.println("Light with ID " + lightId + " not found.");
    }

    public void setLightColor(String lightId, String color) {
        for (ISmartDevice device : devices) {
            if (device instanceof ISmartLight) {
                ISmartLight light = (ISmartLight) device;
                if (light.getDeviceId().equals(lightId)) {
                    light.setColor(color);
                    return;
                }
            }
        }
        System.out.println("Light with ID " + lightId + " not found.");
    }

    public void startCameraRecording(String cameraId) {
        for (ISmartDevice device : devices) {
            if (device instanceof ISmartCamera) {
                ISmartCamera camera = (ISmartCamera) device;
                if (camera.getDeviceId().equals(cameraId)) {
                    camera.startRecording();
                    return;
                }
            }
        }
        System.out.println("Camera with ID " + cameraId + " not found.");
    }

    public void stopCameraRecording(String cameraId) {
        for (ISmartDevice device : devices) {
            if (device instanceof ISmartCamera) {
                ISmartCamera camera = (ISmartCamera) device;
                if (camera.getDeviceId().equals(cameraId)) {
                    camera.stopRecording();
                    return;
                }
            }
        }
        System.out.println("Camera with ID " + cameraId + " not found.");
    }
}
