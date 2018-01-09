public class BasicAlgosTest {
	public static void main(String[] args){
		BasicAlgos algos = new BasicAlgos();
		algos.print1to255();
		algos.printOdds1to255();
		algos.printSums1to255();
		int[] arr = {1,4,8,12,1};
		algos.iterateArray(arr);
		algos.arrayMax(arr);
		algos.average(arr);
		algos.oddArray1to255();
		algos.greaterThanY(arr, 6);
		algos.squareArray(arr);
		// int[] array = {1,-3,6,-8,0,10};
		algos.removeNegatives(arr);
		algos.minMaxAvg(arr);
		algos.shiftArray(arr);
	}
}