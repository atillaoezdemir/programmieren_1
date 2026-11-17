package klausursuebungen;

class Node {
	String name;
	Node previous;

	public Node(String name) {
		this.name = name;
		this.previous = null;
	}

	public class LinkedList {

		Node last;

		public LinkedList() {
			this.last = null;
		}

		public void insert(String name) {
			Node newNode = new Node(name);
			if (last == null) {
				last = newNode;
			} else {
				newNode.previous = last;
				last = newNode;
			}
		}

		public String toString() {
			String names = "";
			Node current = last;
			while (current != null) {
				names += current.name + " ";
				current = current.previous;
			}
			return names;
		}
	}
}
