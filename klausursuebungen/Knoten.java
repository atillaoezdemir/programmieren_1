package klausursuebungen;

public class Knoten {
	
	String wort;
	String bedeutung;
	Knoten right;
	Knoten left;

	Knoten(String wort, String bedeutung) {
		this.wort = wort;
		this.bedeutung = bedeutung;
	}

	public class baum {
		Knoten root;

		public void insert(Knoten neu) {

			if (root == null) {
				root = neu;
			} else
				insert(root, neu);
		}

		public void insert(Knoten temp, Knoten neu) {
			if (temp.wort.compareTo(neu.wort) < 0) {
				if (temp.left == null)
					temp.left = neu;
				else
					insert(temp.left, neu);
			} else {
				if (temp.right == null)
					temp.right = neu;
				else
					insert(temp.right, neu);
			}
		}

		public String search(String search) {
			Knoten temp = root;
			while (temp != null) {
				if (temp.wort.equals(search))
					return temp.bedeutung;
				else if (wort.compareTo(temp.wort) < 0)
					temp = temp.left;
				else
					temp = temp.right;
			}
			return null;
		}

		public void delete(String wort) {
			delete(root, wort);
		}

		public void delete(Knoten root, String wort) {
			if(root.wort == wort) {
				
			}
			if (root.wort.compareTo(wort) > 0)
		            root.left = delete(root.left, wort);
		        else if (root.compareTo(wort) < 0) {
		            root.right = delete(root.right, wort);
		        else {
		            if (root.left == null)
		                root.right;
		            else if (root.right == null)
		                .left;
			}
		}

		public void print() {
			inOrder(root);
		}

		private void inOrder(Knoten current) {
			if(current.left != null) 
				inOrder(current.left);
			
			System.out.println(current.wort);
			
			if(current.right != null) 
				inOrder(current.right);
		}
	}

	public static void main(String[] args) {

	}
}
