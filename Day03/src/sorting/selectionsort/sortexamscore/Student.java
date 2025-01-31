package sorting.selectionsort.sortexamscore;
// Class Student used for sort the exam score
public class Student {
    // Method sortStudentScore is used to sort the score
    public static void sortStudentScore(int score[]){
        // length of marks array
        int n = score.length;

        // Iterate over the marks array
        for(int  i = 0; i < n-1; i++){
            int minPosition = i;
            for(int j = i+1; j < n; j++){
                // Find the minimum element in the array
                if(score[minPosition] > score[j]) {
                    minPosition = j;
                }
            }
            // Swap
            int temp = score[minPosition];
            score[minPosition] = score[i];
            score[i] = temp;

        }
    }

    // Method to display the sorted array
    public static void display(int score[]){
        System.out.print("Students sorted score : ");
        for(int i =0 ; i < score.length; i++){
            System.out.print(score[i]+" ");
        }
        System.out.println();
    }

}
