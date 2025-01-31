package sorting.bubblesort.sortstudentmarks;
// Main class for Students
public class Main {
    public static void main(String args[]){
        int marks[] = {96,54,88,66,98,12,78};
        // call sortStudentMark method from Student class
        Students.sortStudentMark(marks);
        // call display method from Student class
        Students.display(marks);
    }
}
