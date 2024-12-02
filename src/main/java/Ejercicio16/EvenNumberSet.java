package Ejercicio16;
import java.util.Set;
import java.util.HashSet; // implementacion de interfaz set
import java.util.Iterator;
import java.util.Collection;


public class EvenNumberSet implements Set<Integer>{
	
	private Set<Integer> numbers = new HashSet(); 
	

	
    @Override
    public boolean add(Integer number) {
        // Solo permite agregar números pares
        if (number != null && number % 2 == 0) {
            return numbers.add(number);
        }
        return false;
    }

    // Delegamos el resto de los métodos al HashSet interno
    @Override
    public int size() {
        return numbers.size();
    }

    @Override
    public boolean isEmpty() {
        return numbers.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return numbers.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {
        return numbers.iterator();
    }

    @Override
    public Object[] toArray() {
        return numbers.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return numbers.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return numbers.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return numbers.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        boolean modified = false;
        for (Integer num : c) {
            if (num != null && num % 2 == 0) {
                modified |= numbers.add(num);
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return numbers.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return numbers.removeAll(c);
    }

    @Override
    public void clear() {
        numbers.clear();
    }
	    

}






