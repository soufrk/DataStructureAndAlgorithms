package algorithm.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {4,2,1,5,8,3,10};
		int key = 8;
		
		linearSearch(arr, key);
	}

	private static void linearSearch(int[] arr, int key) {
		for(int i = 0; i < arr.length; i++ ){
			if(arr[i] == key){
				System.out.println("Position: " + (i + 1));
				break;
			}
		}
	}

}
