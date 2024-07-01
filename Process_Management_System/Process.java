package Process_Management_System;

public class Process {
	private int processId;
	private String processName;
	private String status; // Status of the process (Pending, Running, Completed)

	// Constructor
	public Process(int processId, String processName, String status) {
		this.processId = processId;
		this.processName = processName;
		this.status = status;
	}

	public int getProcessId() {
		return processId;
	}

	public String getProcessName() {
		return processName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// toString method to return the process details as a string
	@Override
	public String toString() {
		return "Process [processId=" + processId + ", processName=" + processName + ", status=" + status + "]";
	}
}
