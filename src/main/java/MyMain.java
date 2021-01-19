public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        // YOUR CODE HERE
        double sum = 0;
        double ct = 0;
        for (int row = 0; row < mat.length;row++){
            for (int cul = 0; cul < mat[0].length;cul++){
                sum += mat[row][cul];
                ct+=1;
            }
        }
        return sum/ct;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // YOUR CODE HERE 
        double sum = 0;
        double ct = 0;
        for (int row = 0; row < mat.length;row++){
            for (int cul = 0; cul < mat[0].length;cul++){
                ct+=1;
            }
        }
        double[] array = new double[(int)ct+1];
        for (int row = 0; row < mat.length;row++){
            for (int cul = 0; cul < mat[0].length;cul++){
                array[(int)ct] = mat[row][cul];
            }
        }
        if (ct%2 == 1){
            return (double)(array[(int)ct/2] + array[(int)ct/2-1])/2.0;
        }
        if (ct%2 == 0){
            return (double)array[(int)ct/2];
        }
        else {
            return 0;
        }
        
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // YOUR CODE HERE
        int ct = 0;
        for (int row = 0; row < mat.length;row++){
            for (int cul = 0; cul < mat[0].length;cul++){
                ct+=1;
            }
        }
        double[] array = new double[ct];
        int time = 0;
        for (int row = 0; row < mat.length;row++){
            for (int cul = 0; cul < mat[0].length;cul++){
                array[time] = mat[row][cul];
                time++;
            }
        }
        int count = 1;
        int longest = 0;
        double mode = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } 
            else {
                count = 1;
            
            }
            if (count > longest) {
                mode = array[i];
                longest = count;
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
