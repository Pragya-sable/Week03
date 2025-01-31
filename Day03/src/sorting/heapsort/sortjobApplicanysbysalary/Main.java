package sorting.heapsort.sortjobApplicanysbysalary;

public class Main {
    public static void main(String args[])
    {
        int salary[] = { 12, 11, 13, 5, 6, 7 };
        // Call the sort()
        SortBySalary.sort(salary);
        SortBySalary.printArray(salary);
    }
}
