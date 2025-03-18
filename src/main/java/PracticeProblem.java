public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find(int[] arr, int n){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n) return i;
		}
		return -1;
	}
	public static int findLast(String[] arr, String n){
		int o = -1;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n) o = i;
		}
		return o;
	}
	public static int findSecond(char[] arr, char n){
		int o = -1;
		boolean foundFirst = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == n){
				if(foundFirst) return i;
				o = i;
				foundFirst = true;
			}
		}
		return o;
	}	

}
