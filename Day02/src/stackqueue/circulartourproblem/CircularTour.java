package stackqueue.circulartourproblem;
// Class with name CircularTour used for the purpose
// to determine the starting point for completing a circular tour
public class CircularTour {
    public static int tour(int petrol[], int distance[]){
        int n = petrol.length;
        int start = 0;
        int rem = 0;
        int deficit = 0;

        for(int i = 0; i<n; i++) {
            rem += (petrol[i] - distance[i]);
            if(rem < 0 )
            {
                start = i+1;
                deficit += rem;
                rem = 0;
            }
        }
        if(rem + deficit >= 0)
            return start;

            return -1;

    }
}
