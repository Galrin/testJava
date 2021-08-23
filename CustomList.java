public interface CustomList {
	void add(Object e);
	void add(int index, Object element);
	void clear();
	Object get(int index );
	int indexOf(Object e);
	void remove(int index);
	void remove(Object e);
	void set(int index, Object element);
	int size();
}