package sorting.insertionsort.sortemployeeids;
// Main class for Sort Employee IDs
public class Main {
    public static void main(String[] args) {
        int employeeIds[] = {115,113,117,118,121,102};
        // Call sortEmployeeIds method from Employee
        Employee.sortEmployeeId(employeeIds);
        // Call prints method from Employee
        Employee.prints(employeeIds);

    }
}
