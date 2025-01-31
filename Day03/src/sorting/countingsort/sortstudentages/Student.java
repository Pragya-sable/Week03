package sorting.countingsort.sortstudentages;
// Class Student used for sort the student age
public class Student {
    // Method for sort the age of student
    public static void sortStudentAge(int age[]){
        int largest = Integer.MIN_VALUE;

        for(int  i = 0 ;i < age.length; i++){
            largest = Math.max(largest,age[i]);
        }

        int count[]= new int[largest+1];
        for(int i = 0; i < age.length; i++){
            count[age[i]]++;
        }
        // Sorting
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                age[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    // Method for print
    public static void prints(int arr[]){
        System.out.print("Sorted Age of Student : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
