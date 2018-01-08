public class FizzBuzz {
    public String printFizzBuzz(int number) {
        
            if (number%5 == 0 && number%3 == 0){
                System.out.println("FizzBuzz");
                return "Divisible by 3";
            }      
            if (number%5 == 0) {
                System.out.println("Buzz");
                return " ";
            }
            if (number%3 == 0){
                System.out.println("Fizz");
                return " ";
            }
            else{
                System.out.println(number);
                return " ";
            }


    }
    }

