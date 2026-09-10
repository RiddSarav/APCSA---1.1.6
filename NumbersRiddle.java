/*
 * Activity 1.1.6
 */


public class NumbersRiddle {
    public static void main(String [] args) {
        int positive = 5;
        int negative = -5;
        int zero = 0;
        int one = 1;
        double positiveDouble = 0.5;
        double negativeDouble = -0.5;
        double startingValue=5.0;

        //Positive
        System.out.println("Positive Test-case");
        startingValue = positive;
        System.out.println("the original number is " + positive);
        positive *= 2;
        System.out.println("doubled number " + positive);
        positive+=6;
        System.out.println("added 6 " + positive);
        positive/=2;
        System.out.println("halved " + positive);
        positive-=startingValue;
        System.out.println("subtracted original " + positive); 
        
        //Negative
        System.out.println("Negative Test-case");
        startingValue = negative;
        System.out.println("the original number is " + negative);
        negative *= 2;
        System.out.println("doubled number " + negative);
        negative+=6;
        System.out.println("added 6 " + negative);
        negative/=2;
        System.out.println("halved " + negative);
        negative-=startingValue;
        System.out.println("subtracted original " + negative); 

        //Zero
        System.out.println("Zero Test-case");
        startingValue = zero;
        System.out.println("the original number is " + zero);
        zero *= 2;
        System.out.println("doubled number " + zero);
        zero+=6;
        System.out.println("added 6 " + zero);
        zero/=2;
        System.out.println("halved " + zero);
        zero-=startingValue;
        System.out.println("subtracted original " + zero); 

        //One
        System.out.println("One Test-case");
        startingValue = one;
        System.out.println("the original number is " + one);
        one *= 2;
        System.out.println("doubled number " + one);
        one+=6;
        System.out.println("added 6 " + one);
        one/=2;
        System.out.println("halved " + one);
        one-=startingValue;
        System.out.println("subtracted original " + one); 

        //positive double
        System.out.println("Positive Double Test-case");
        startingValue = positiveDouble;
        System.out.println("the original number is " + positiveDouble);
        positiveDouble *= 2;
        System.out.println("doubled number " + positiveDouble);
        positiveDouble+=6;
        System.out.println("added 6 " + positiveDouble);
        positiveDouble/=2;
        System.out.println("halved " + positiveDouble);
        positiveDouble-=startingValue;
        System.out.println("subtracted original " + positiveDouble); 

        //negative double
        System.out.println("Negative Double Test-case");
        startingValue = negativeDouble;
        System.out.println("the original number is " + negativeDouble);
        negativeDouble *= 2;
        System.out.println("doubled number " + negativeDouble);
        negativeDouble+=6;
        System.out.println("added 6 " + negativeDouble);
        negativeDouble/=2;
        System.out.println("halved " + negativeDouble);
        negativeDouble-=startingValue;
        System.out.println("subtracted original " + negativeDouble); 
        
        

       

    };
    
}