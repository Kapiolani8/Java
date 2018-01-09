import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Puzzles { 
    public String sumArray(int[] arr){
        int sum = 0; 
        for (int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        return String.valueOf(sum);
    }
    public String greaterThan(int[] arr){
        ArrayList<Integer> greaterArr = new ArrayList<Integer>();
        for (int i =0; i < arr.length; i++){
            if (arr[i] > 10){
                greaterArr.add(arr[i]);
            }
        }
        return Arrays.toString(greaterArr.toArray());
    }

    public String[] shuffleNames(String[] names){
        int len = names.length;
        String tmp; 
        Random rand = new Random();
        for (int i = 0; i < len; i++){
            int index = rand.nextInt(len-1); 
            tmp = names[i];
            names[i] = names[index]; 
            names[index] = tmp;
        }
        int num = 0;
		for (int i = 0; i < len; i++){
			if(names[i].length() > 5){
				num++;
			}
		}
		String[] newNames;
		newNames = new String[num];
		int counter = 0;
		for (int i = 0; i < len; i++){
			if(names[i].length() > 5){
				newNames[counter] = names[i];
				counter++;
			}
		}
		return newNames;
    }
    public void lettersOfTheAlphabet() {
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		Random rand = new Random();
		char tmp;
		for (int i = 0; i < 25; i++){
			int index = rand.nextInt(25) + 1;
			tmp = alphabet[i];
			alphabet[i] = alphabet[index];
			alphabet[index] = tmp;
		}
		System.out.println("The last letter of the shuffled array is " + alphabet[25]);
		System.out.println("The first letter of the array is " + alphabet[0]);
		if(alphabet[0] == 'a' || alphabet[0] == 'e' || alphabet[0] == 'i' || alphabet[0] == 'o' || alphabet[0] == 'u'){
			System.out.println("it's a vowel");
		}
    }
    
    public int[] randomNumbers() {
		Random rand = new Random();
		int[] arr;
		arr = new int[10];
		for (int i = 0; i < 10; i++){
			arr[i] = rand.nextInt(46) + 55;
        }
        
        System.out.println(Arrays.toString(arr));

        return arr;
    }
    
    public int[] randomSortedNumbers(){
        Random rand = new Random();
        int[] arr;
        arr = new int[10];
		for (int i = 0; i < 10; i++){
			arr[i] = rand.nextInt(46) + 55;
        }
        int tmp; 
        arr = new int[10];

        for (int j = 1; j<10 - 1; j++){
            if (arr[j-1] > arr[j]){
                tmp = arr[j-1]; 
                arr[j-1] = arr[j];
                arr[j] = tmp;
            }
        }
    for (int i = 0; i < 10; i++){
        System.out.println(arr[i]);
    }
    System.out.println("Min is: " + arr[0]);
    System.out.println("Max is: " + arr[9]);
    return arr;
    }

    public static String createRandomString(int len) {
        String randomString = ""; 
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; 

        Random rand = new Random(); 
        for(int i=0; i < len; i++) {
            char letter = alphabet.charAt(rand.nextInt(26)); 
            randomString += letter;
        }

        return randomString;
    }
    public static ArrayList createRandomStringArray(int stringLen, int arrayLen) {
        ArrayList<String> newRandomArray = new ArrayList<String>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz"; 
        Random rand = new Random(); 

        for(int j=0; j < arrayLen; j++) {
            String randomString = ""; 

            for(int i=0; i < stringLen; i++) {
                char letter = alphabet.charAt(rand.nextInt(26)); 
                randomString += letter;
            }

            newRandomArray.add(randomString); 
        }

        return newRandomArray;
    }
}

