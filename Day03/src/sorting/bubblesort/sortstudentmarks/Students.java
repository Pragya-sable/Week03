package sorting.bubblesort.sortstudentmarks;
// Class Student is used for sorting the marks of student in ascending order
public class Students {
    // Method sortStudentMark is used to sort the marks
    public static void sortStudentMark(int marks[]){
        // length of marks array
        int n = marks.length;
        boolean swap;

        // Iterate over the marks array
        for(int  i = 0; i < n; i++){
            swap = false;
            for(int j = 0; j < n - i - 1; j++){
                // Compare adjacent elements
                if(marks[j] > marks[j+1]) {
                    // Swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swap = true;
                }
            }
            // if no swap is occurred
            if(swap == false) {
                break;
            }
        }
    }

    // Method to display the sorted array
    public static void display(int marks[]){
        System.out.print("Students sorted marks : ");
        for(int i =0 ; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }


}
