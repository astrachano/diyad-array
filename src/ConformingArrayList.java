import java.util.*;

public class ConformingArrayList<E> implements List<E> {

	private Object[] myStorage;
	private int mySize;
	private static int MAX_SIZE = 500;
	
	public ConformingArrayList() {
		myStorage = new Object[MAX_SIZE];
		mySize = 0;
	}
	
	@Override
	public boolean add(E s) {
		checkSize();
		myStorage[mySize] = s;
		mySize++;
		return true;
	}
	
	@Override
	public void add(int index, E s) {
		if (index < 0 || index > mySize) {
			throw new IndexOutOfBoundsException("bad index in add "+index);
		}
		checkSize();
		System.arraycopy(myStorage, index, myStorage, index+1, mySize-index);
		myStorage[index] = s;
		mySize++;
	}
	
	@Override
	public int size() {
		return mySize;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		rangeCheck(index);
		return (E) myStorage[index];
	}
	
	private void rangeCheck(int index) {
		if (index < 0 || index >= mySize) {
			throw new IndexOutOfBoundsException("index out of bounds " + index
					+ " of " + mySize);
		}
	}
	
	private void checkSize() {
		if (mySize >= myStorage.length) {
			Object[] storage = new Object[myStorage.length*2];
			System.arraycopy(myStorage, 0, storage, 0, myStorage.length);
			myStorage = storage;
		}
	}

	@Override
	public boolean isEmpty() {
		return mySize > 0;
	}

	@Override
	public boolean contains(Object o) {
		for(E elt : this) {
			if (elt.equals(o)) return true;
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		throw new NoSuchMethodError("no remove");
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new NoSuchMethodError("no containsAll");
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		int osize = size();
		for(E element : c) {
			this.add(element);
		}
		return osize != size();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		mySize = 0;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		for(int dex = size()-1; dex >= 0; dex--) {
			if (get(dex).equals(o)) {
				return dex;
			}
		}
		return -1;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
