package sorting.heapsort.sortjobApplicanysbysalary;

public class SortBySalary {
    public static void sort(int salary[])
    {
        int n = salary.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(salary, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            // call max heapify on the reduced heap
            heapify(salary, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in salary[]. n is size of heap
   public static void heapify(int salary[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n &&salary[l] >salary[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && salary[r] > salary[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = salary[i];
            salary[i] = salary[largest];
            salary[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(salary, n, largest);
        }
    }

    
  public static void printArray(int salary[])
    {
        int n = salary.length;
        System.out.print(" Sorted Applicant : ");
        for (int i = 0; i < n; ++i)
            System.out.print(salary[i] + " ");
        System.out.println();
    }

}
