package sorting.countingsort.sortstudentages;
// Main class for sort student age
public class Main {
    public static void main(String[] args) {
        int age[] = {15,21,14,18,22,26,13};
        // Call sortStudentAge method
        Student.sortStudentAge(age);
        // Call print method
        Student.prints(age);
    }
}

