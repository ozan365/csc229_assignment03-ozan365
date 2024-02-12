import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        //generate random integer for the index of the heavy bag between 0 and 19
        int r1 = rand.nextInt(20);

        //sum and answer variables
        double sum = 0;
        double answer;

        //array representing 20 bags
        double[] arr = new double[20];

        for(int i = 0; i < 20; i++) {
            //set every array element to 1.0
            arr[i] = 1.0;
            //if the element is the chosen heavy bag set to 1.1
            if (i == r1)
                arr[i] = 1.1;
        }

        //print out the chosen index + 1 for the number of the bag
        System.out.println(r1 + 1 + "\n");


        for(int i = 0;i < 20; i++) {
            //add the weight of each M&M (element in array) times the number of the bag (represented by the for loop iterating over each bag number) to sum
            sum += arr[i] * (i + 1);
        }

        //subtract sum by 210.0 and divide by 0.1
        answer = (sum - 210.0) / 0.1;

        //print out the value of answer
        System.out.println("Answer is bag " + answer);


    }
}