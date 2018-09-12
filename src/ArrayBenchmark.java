
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
		
		int start = 10000;
		int end = 100000;
		int incr = 10000;
		
		for(int size = start; size <= end; size += incr){
			double time = addStrings(size);
			System.out.printf("%d,%2.3f\n",size,time);
		}
	}
}
