
public class ArrayBenchmark {
	
	public static double addStrings(int n){
		double start = System.nanoTime();
		GrowableStringArrayList gsa = new GrowableStringArrayList();
		for(int k=0; k < n; k++) {
			//gsa.add(0,"hello");
			gsa.add("hello");
		}
		double end = System.nanoTime();
		return (end-start)/1e9;
	}
	
	public static void main(String[] args){
		
		for(int size = 100000; size <= 2000000; size += 100000){
			double time = addStrings(size);
			System.out.printf("%d,%2.3f\n",size,time);
		}
	}
}
