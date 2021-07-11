public class Example14 {
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6};
		int[] B = {1,2,3,4,5,6,7};
		int[] C = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Average of list A is " + average(A));
		System.out.println("Average of list B is " + average(B));
		System.out.println("Average of list C is " + average(C));
	}
	
	static double average(int[] list) {
		double avg = 0;
		for(int i = 0; i < list.length; i++) {
			avg += list[i];
		}
		
		return avg/list.length;
	}
}
