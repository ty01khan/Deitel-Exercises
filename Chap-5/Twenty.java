public class Twenty {
	public static void main(String[] args) {
		float pi = 4;
		int i = 0, cnt = 0;
		for(i = 0; i <= 200000; i++) {
			if(i % 2 == 0)
				pi -= (float) 4/(2*i + 3);
			else
				pi += (float) 4/(2*i + 3);
			
			if(cnt == 0)
				if(pi < 3.1416 && pi > 3.1415901) {
					System.out.println(i + " terms is used before begin with 3.14159");
					System.out.println("Pi = " + pi);
					cnt++;
				}
		}
		System.out.println("Pi = " + pi);
	}
}
