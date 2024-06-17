package oops_oops_Unified_Smart_Home_Automation_System;

//import org.devices.SmartLight;
//import org.devices.SmartThermostat;
//import org.devices.SmartCamera;
//import org.interfaces.ISmartLight;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SmartHomeController controller = new SmartHomeController();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Smartest Home Automation System");

		while (true) {
			System.out.println("1. Add Smart Light");
			System.out.println("2. Add Smart Thermostat");
			System.out.println("3. Add Smart Camera");
			System.out.println("4. Turn All Devices On");
			System.out.println("5. Turn All Devices Off");
			System.out.println("6. Set Light Brightness");
			System.out.println("7. Set Light Color");
			System.out.println("8. Start Camera Recording");
			System.out.println("9. Stop Camera Recording");
			System.out.println("10. Exit");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter Light Device ID: ");
				String lightId = scanner.nextLine();
				System.out.print("Enter Light Device Name: ");
				String lightName = scanner.nextLine();
				SmartLight light = new SmartLight(lightId, lightName);
				controller.addDevice(light);
				break;
			case 2:
				System.out.print("Enter Thermostat Device ID: ");
				String thermostatId = scanner.nextLine();
				System.out.print("Enter Thermostat Device Name: ");
				String thermostatName = scanner.nextLine();
				SmartThermostat thermostat = new SmartThermostat(thermostatId, thermostatName);
				controller.addDevice(thermostat);
				break;
			case 3:
				System.out.print("Enter Camera Device ID: ");
				String cameraId = scanner.nextLine();
				System.out.print("Enter Camera Device Name: ");
				String cameraName = scanner.nextLine();
				SmartCamera camera = new SmartCamera(cameraId, cameraName);
				controller.addDevice(camera);
				break;
			case 4:
				controller.turnAllOn();
				break;
			case 5:
				controller.turnAllOff();
				break;
			case 6:
				System.out.print("Enter Light Device ID to Set Brightness: ");
				String brightnessLightId = scanner.nextLine();
				System.out.print("Enter Brightness Level (0-100): ");
				int brightness = scanner.nextInt();
				scanner.nextLine();
				controller.setLightBrightness(brightnessLightId, brightness);
				break;
			case 7:
				System.out.print("Enter Light Device ID to Set Color: ");
				String colorLightId = scanner.nextLine();
				System.out.print("Enter Color: ");
				String color = scanner.nextLine();
				controller.setLightColor(colorLightId, color);
				break;
			case 8:
				System.out.print("Enter Camera Device ID to Start Recording: ");
				String startRecCameraId = scanner.nextLine();
				controller.startCameraRecording(startRecCameraId);
				break;
			case 9:
				System.out.print("Enter Camera Device ID to Stop Recording: ");
				String stopRecCameraId = scanner.nextLine();
				controller.stopCameraRecording(stopRecCameraId);
				break;
			case 10:
				System.out.println("Exiting...");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
