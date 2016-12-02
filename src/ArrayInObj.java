
public class ArrayInObj {
	private Person[] person;
	private int nElems;

	public ArrayInObj(int max) {
		person = new Person[max];
		nElems = 0;
	}

	public void insert(String lastName, String firstName, int age) {
		person[nElems] = new Person(firstName, lastName, age);
		nElems++;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			person[i].display();
			System.out.println("");
		}
	}

	public void insertionSort() {
		int out, in;
		for (out = 0; out < nElems; out++) {
			in = out;
			Person temp = person[out];
			for (in = out; in > 0 && person[in - 1].getLastName().compareTo(temp.getLastName()) > 0; in--) {
				person[in] = person[in-1];
			}
			person[in] = temp;
		}
	}
}
