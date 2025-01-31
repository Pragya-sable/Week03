package sorting.selectionsort.sortexamscore;
// Main class for sort exam score
public class Main {
    public static void main(String[]args){
        int score[] = {8,3,4,9,2,7};
        // call the sortStudentScore method from Student
        Student.sortStudentScore(score);
        // call display method from Student
        Student.display(score);
    }
}
