
public class GrowableStringArrayList  {
	private String[] myStorage;
	private int mySize;
	private static int MAX_SIZE = 500;
	
	public GrowableStringArrayList() {
		myStorage = new String[MAX_SIZE];
		mySize = 0;
	}
	
	public void add(String s) {
		checkSize();
		myStorage[mySize] = s;
		mySize++;
	}
	
	public void add(int index, String s) {
		if (index < 0 || index > mySize) {
			throw new IndexOutOfBoundsException("bad index in add "+index);
		}
		checkSize();
		System.arraycopy(myStorage, index, myStorage, index+1, mySize-index);
		myStorage[index] = s;
		mySize++;
	}
	
	public int size() {
		return mySize;
	}
	
	public String get(int index) {
		rangeCheck(index);
		return myStorage[index];
	}
	
	public String set(int index, String s) {
		rangeCheck(index);
		String old = myStorage[index];
		myStorage[index] = s;
		return old;
	}
	
	private void rangeCheck(int index) {
		if (index < 0 || index >= mySize) {
			throw new IndexOutOfBoundsException("index out of bounds " + index
					+ " of " + mySize);
		}
	}
	
	private void checkSize() {
		if (mySize >= myStorage.length) {
			String[] storage = new String[myStorage.length * 2];
			System.arraycopy(myStorage, 0, storage, 0, myStorage.length);
			myStorage = storage;
		}
	}

}
