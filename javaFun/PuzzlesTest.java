public class PuzzlesTest{
    public static void main (String[] args){
        Puzzles test = new Puzzles();

        int[] arr = {3,5,1,2,7,9,8,13,25,32};

        // int[] newArrayTest = test.shrinkArray(arr, 10);


        System.out.println(test.sumArray(arr));
        System.out.println(test.greaterThan(arr));

        String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        String [] newNames = test.shuffleNames(names);
        int len = newNames.length; 
        for (int i = 0; i < len; i++){
            System.out.println(newNames[i]);
        }

        test.lettersOfTheAlphabet();
        System.out.println(test.randomNumbers());
        System.out.println(test.randomSortedNumbers());
        System.out.println(test.createRandomString(5));
        System.out.println(test.createRandomStringArray(5,10));
    }

}