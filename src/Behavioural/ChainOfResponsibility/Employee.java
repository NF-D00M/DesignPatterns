package Behavioural.ChainOfResponsibility;

//Abstract handler
public abstract class Employee implements LeaveApprover {
    private String role;
    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.successor = successor;
        this.role = role;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if(processRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }
    }
    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }
}