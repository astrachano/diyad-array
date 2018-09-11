

public class SimpleStringArrayList {
	private String[] myStorage;
	private int mySize;
	private static int MAX_SIZE = 1000;
	
	public SimpleStringArrayList() {
		myStorage = new String[MAX_SIZE];
		mySize = 0;
	}
	
	public void add(String s) {
		if (mySize < myStorage.length) {
			myStorage[mySize] = s;
			mySize++;
		}
		else {
			throw new ArrayIndexOutOfBoundsException("out of storage at "+mySize);
		}
	}
	public int size() {
		return mySize;
	}
	
	public String get(int index) {
		if (0 <= index && index < mySize) {
			return myStorage[index];
		}
		throw new ArrayIndexOutOfBoundsException("out of range with "+index);
	}
}
