package randomNumber;

import java.util.Arrays;
import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		int start = 100;
        int end = 1001;
        int counter = 500;

        int smallest;
        
        int randomInt ;

        int numbers [] = new int[counter];
        Random random = new Random(); 

        randomInt = random.nextInt(end-start) + start;
        numbers [0] = randomInt;

        smallest = randomInt;
       

        System.out.println("0th Smallest : " + smallest );

        for(int i=1;i<counter;i++) {

            numbers[i] = random.nextInt(end-start) + start;

            smallest = Math.min(smallest,numbers[i]);
            
            System.out.println("Random numbers: " + Arrays.toString(numbers) + "\n\n");
            
            System.out.println(i + "th Smallest : " + smallest + "\n");

        }
		
		
	}



	}


