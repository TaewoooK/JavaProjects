package StatListTester;

public interface Liist<E> {
	
	abstract public boolean isEmpty();
	abstract public boolean add(E obj);
	abstract public void add(int p, E obj);
	abstract public int size();
	abstract public E get(int p);
	abstract public E set(int p, E obj);
	abstract public E remove(int p);

}
