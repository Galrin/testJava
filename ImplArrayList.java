public class ImplArrayList implements CustomList {
		public static final int STACK_SIZE = 16;

 	 	private Object[] list = new Object[STACK_SIZE];
 	 	private int size = 0;

		@Override
		public void clear() {
			this.list = new Object[STACK_SIZE];
		}

		@Override
		public int size() {
			return this.size;
		}

		@Override
		public void add(Object e) {
			int lastSize = size;

			//fuck...find free space
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) {
					this.list[i] = e;
					this.size++;
					break;
				}
			}
			if(lastSize == size) { // бл*ть, ничего не найдено, значит массив полон. перепихиваем массив в массив побольше
				Object[] oldlist = list.clone();
				this.list = new Object[list.length + STACK_SIZE];
    			System.arraycopy(oldlist, 0, list, 0, oldlist.length);	
				this.list[size] = e;
				this.size++;
    		}
		}

		@Override
		public Object get(int index) {
			return this.list[index];
		}

		@Override
		public void remove(int index) {
			this.list[index] = null;
							 --this.size;
		}

		@Override
		public void remove(Object e) {
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) continue;

				if(this.list[i].equals(e)) {
					this.list[i] = null;
								 --this.size;
					break;
				}
			}
		}

//		@Override
		public void removeAll(Object e) {
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) continue;
				
				if(this.list[i].equals(e)) {
					this.list[i] = null;
								 --this.size;
				}
			}
		}

		@Override
		public int indexOf(Object e) {
			for ( int i = 0; i < this.list.length; i++) {
				if(this.list[i] == null) continue;
				
				if(this.list[i].equals(e)) {
					return i;
				}
			}
			return -1;
		}

		@Override
		public void set(int index, Object e) {
			this.list[index] = e;
		}

		@Override
		public void add(int index, Object e) {
			if(list[index] == null) {
				this.set(index, e);
				return;
			}
			
			Object[] oldlist = list.clone();

			if( (size + 1) > list.length ) { // у нас выход за рамки выделенной области
				this.list = new Object[list.length + STACK_SIZE];
	    		System.arraycopy(oldlist, 0, list, 0, oldlist.length);	
			}



			Object[] slice = java.util.Arrays.copyOfRange(list, index, list.length);
			System.arraycopy(slice, 0, list, index+1, slice.length-1);

			this.list[index] = e;
			this.size++;
		}

}