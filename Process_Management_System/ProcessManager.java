package Process_Management_System;

import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List; 

public class ProcessManager {
	private List<Process> processes; // To store all processes
	private List<Process> pendingProcessesHistory; // To store history of pending processes
	private List<Process> completedProcessesHistory; // To store history of completed processes

	// Constructor
	public ProcessManager() {
		processes = new ArrayList<>(); // Initialize ArrayList for all processes
		pendingProcessesHistory = new LinkedList<>(); // Initialize LinkedList for pending processes history
		completedProcessesHistory = new LinkedList<>(); // Initialize LinkedList for completed processes history
	}

	// Add a new process to the system
	public void addProcess(Process process) {
		processes.add(process); // Add the process to the list of all processes
		if ("Pending".equals(process.getStatus())) { // If the process is pending
			pendingProcessesHistory.add(process); // Add it to the pending processes history
		}
	}

	// Remove a process by its ID
	public boolean removeProcess(int processId) {
		for (Process process : processes) { // Iterate  the list of all processes
			if (process.getProcessId() == processId) { // If the process ID matches
				processes.remove(process); // Remove it from the list of all processes
				pendingProcessesHistory.remove(process); // Remove it from pending processes history
				completedProcessesHistory.remove(process); // Remove it from completed processes history
				return true; // Return true indicating the process was removed
			}
		}
		return false; // Return false if the process was not found
	}

	// Search for a process by its ID
	public Process searchProcess(int processId) {
		for (Process process : processes) { // Iterate the list of all processes
			if (process.getProcessId() == processId) { // If the process ID matches
				return process; // Return the process
			}
		}
		return null; // Return null if the process was not found
	}

	// List all processes
	public List<Process> listAllProcesses() {
		return new ArrayList<>(processes); // Return a new ArrayList containing all processes
	}

	// Update the status of a process by its ID
	public boolean updateProcessStatus(int processId, String newStatus) {
		for (Process process : processes) { // Iterate the list of all processes
			if (process.getProcessId() == processId) { // If the process ID matches
				if (!process.getStatus().equals(newStatus)) { // If the new status is different from the current status
					if ("Completed".equals(newStatus)) { // If the new status is Completed
						completedProcessesHistory.add(process); // Add the process to the completed processes history
						pendingProcessesHistory.remove(process); // Remove the process from the pending processes
																	// history
					} else if ("Pending".equals(newStatus)) { // If the new status is Pending
						pendingProcessesHistory.add(process); // Add the process to the pending processes history
						completedProcessesHistory.remove(process); // Remove the process from the completed processes
																	// history
					}
					process.setStatus(newStatus); // Update the process status
				}
				return true; // Return true indicating the status was updated
			}
		}
		return false; // Return false if the process was not found
	}

	// Add a pending process to the history
	public void addPendingProcess(Process process) {
		if ("Pending".equals(process.getStatus())) { // If the process is pending
			pendingProcessesHistory.add(process); // Add it to the pending processes history
		}
	}

	// Add a completed process to the history
	public void addCompletedProcess(Process process) {
		if ("Completed".equals(process.getStatus())) { // If the process is completed
			completedProcessesHistory.add(process); // Add it to the completed processes history
		}
	}

	// Get the history of pending processes
	public List<Process> getPendingProcessesHistory() {
		return new LinkedList<>(pendingProcessesHistory); // Return a new LinkedList containing the pending processes
															// history
	}

	// Get the history of completed processes
	public List<Process> getCompletedProcessesHistory() {
		return new LinkedList<>(completedProcessesHistory); // Return a new LinkedList containing the completed
															// processes history
	}
}
