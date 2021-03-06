class InsertionSortObject {
	
	private final int SIZE;

	private int noElem; 
	
	private Patient[] array;

	public InsertionSortObject (int size) {// Constructor
		SIZE = size;
		this.array = new Patient[SIZE];
		noElem = 0;
	}


	public void sort() {

		int pointer;

		int temp; // temporary variable	

		for (int i = 1; i < SIZE; i++) {
			temp = array[i].getAge();
			pointer = i;

			while ( pointer > 0 && array[pointer-1].getAge() > temp ) {
				array[pointer] = array[pointer-1];
				pointer--;
			}

			array[pointer] = temp;
		}
	}

	public void revsort() {
		int min;
		for ( int i = 0; i < SIZE - 1; i++ ) {
			min = i;
			for ( int j = i; j < SIZE - 1; j++ ) {
				if ( array[min].getAge() < array[j+1].getAge() ) {
					min = j+1;
				}
			}
			swap(i, min);
		}
	}
	public void insert(String fname, String lname, int age, String address) {
		 array[noElem] = new Patient(fname, lname, age, address); 

		 noElem++;
	}

	public void swap(int n, int n2) {
		Patient temp = this.array[n];
		this.array[n] = this.array[n2];
		this.array[n2]  = temp;
	}

	public void displayAllObj() {
		for ( int i = 0; i < SIZE; i++ ) {
			this.array[i].displayInfo();
			System.out.println();
		}
	}
}