package Process_Management_System;

public class Main {
	public static void main(String[] args) {

		ProcessManager processManager = new ProcessManager();

		// Add some processes
		processManager.addProcess(new Process(1, "Process1", "Pending")); // Adding a pending process
		processManager.addProcess(new Process(2, "Process2", "Running")); // Adding a running process
		processManager.addProcess(new Process(3, "Process3", "Completed")); // Adding a completed process
		processManager.addProcess(new Process(4, "Process4", "Completed")); // Adding a completed process

		// List all processes
		System.out.println("All processes:");
		for (Process process : processManager.listAllProcesses()) { // Iterate through all processes
			System.out.println(process);
		}

		// Search for a process
		System.out.println("\nSearch for process with ID 2:");
		Process process = processManager.searchProcess(2); // Search for process with ID 2
		if (process != null) {
			System.out.println(process);
		} else {
			System.out.println("Process not found.");
		}

		// Update process status
		System.out.println("\nUpdating status of process with ID 1 to Running...");
		if (processManager.updateProcessStatus(1, "Running")) { // Update status of process with ID 1 to Running
			System.out.println("Process status updated."); // Print success message
		} else {
			System.out.println("Process not found."); // Print not found message
		}

		// List all processes again to see the update
		System.out.println("\nAll processes after status update:");
		for (Process p : processManager.listAllProcesses()) { // Iterate through all processes
			System.out.println(p); // Print each process
		}

		// Remove a process
		System.out.println("\nRemoving process with ID 3...");
		if (processManager.removeProcess(3)) { // Remove process with ID 3
			System.out.println("Process removed.");
		} else {
			System.out.println("Process not found.");
		}

		// List all processes again to see the removal
		System.out.println("\nAll processes after removal:");
		for (Process p : processManager.listAllProcesses()) { // Iterate through all processes
			System.out.println(p);
		}

		// List pending processes history
		System.out.println("\nPending processes history:");
		for (Process p : processManager.getPendingProcessesHistory()) { // Iterate through pending processes history
			System.out.println(p); // Print each pending process
		}

		// List completed processes history
		System.out.println("\nCompleted processes history:");
		for (Process p : processManager.getCompletedProcessesHistory()) { // Iterate through completed processes history
			System.out.println(p); // Print each completed process
		}
	}
}
