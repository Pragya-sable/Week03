package sorting.insertionsort.sortemployeeids;
// Class Employee used for sorting the employeeIds in ascending order
public class Employee {
    // Method for sorting the employeeIds
    public static void sortEmployeeId(int employeeIds[]){
        // length of employeeIds
        int n = employeeIds.length;
        // Iterate through the employeeId array
        for(int i = 1; i < n; i++){
            // Create current variable and assign the employeeIds
            int current = employeeIds[i];
            int j = i - 1;
            // Find the correct position to insert
            while(j >= 0 && employeeIds[j] > current){
                employeeIds[j+1] = employeeIds[j];
                j--;
            }
            employeeIds[j+1] = current;
        }
    }
    // Method to display the sorted employeeIds

    public static void prints(int employeeIds[]){
        System.out.print("Sorted Employee Ids : ");
        for(int i = 0; i < employeeIds.length; i++){
            System.out.print(employeeIds[i] +" ");
        }
        System.out.println();
    }
}
