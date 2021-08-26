public class ImplArrayList<E> implements CustomList<E> {
		public static final int STACK_SIZE = 16;

 	 	private Object[] list;
 	 	private int size = 0;

 	 	private void reorder() {
 	 		Object[] oldlist = list.clone();

			this.list = new Object[list.length];

 	 		for(int i = 0, j = 0; i < list.length; i++) {
 	 			if(oldlist[i] != null) list[j++] = oldlist[i];
 	 		}
 	 	}


 	 	public ImplArrayList () {
 	 		this.list = new Object[STACK_SIZE];
 	 	}

		@Override
		public void clear() {
			this.list = new Object[STACK_SIZE];
		}

		@Override
		public int size() {
			return this.size;
		}

		@Override
		public void add(E e) {
			int lastSize = size;

			// поиск первой свободной ячейки
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) {
					this.list[i] = e;
					this.size++;
					break;
				}
			}
			if(lastSize == size) { // ничего не найдено, значит массив полон. перепихиваем массив в массив побольше
				Object[] oldlist = list.clone();
				this.list = new Object[list.length + STACK_SIZE];
    			System.arraycopy(oldlist, 0, list, 0, oldlist.length);	
				this.list[size] = e;
				this.size++;
    		}
		}

		@Override
		public E get(int index) {
			return (E) this.list[index];
		}

		@Override
		public void remove(int index) {
			this.list[index] = null;
							 --this.size;

			if(size != index) this.reorder();
		}

		@Override
		public void remove(E e) {
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) continue;

				if(this.list[i].equals(e)) {
					this.list[i] = null;
								 --this.size;
					break;
				}
			}
			this.reorder();
		}

//		@Override
		public void removeAll(E e) {
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) continue;
				
				if(this.list[i].equals(e)) {
					this.list[i] = null;
								 --this.size;
				}
			}
			this.reorder();
		}

		@Override
		public int indexOf(E e) {
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) continue;
				
				if(this.list[i].equals(e)) {
					return i;
				}
			}
			return -1;
		}

		@Override
		public void set(int index, E e) {
			this.list[index] = e;
		}

		@Override
		public void add(int index, E e) {
			if(this.list[index] == null) {
				this.set(index, e);
				return;
			}
			

			if( (size + 1) > list.length ) { // у нас выход за рамки выделенной области
				
				Object[] oldlist = this.list.clone();
				this.list = new Object[list.length + STACK_SIZE];
	    		System.arraycopy(oldlist, 0, list, 0, oldlist.length);	
			}



			Object[] slice = java.util.Arrays.copyOfRange(list, index, list.length);
			System.arraycopy(slice, 0, list, index+1, slice.length-1);

			this.list[index] = e;
			this.size++;
		}

}