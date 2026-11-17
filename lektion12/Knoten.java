package Lektion12;

public class Knoten {
	static Lotto ilk = null;
	static Lotto son = null;

	public static void add(int no) {
		Lotto o = new Lotto(no);
		if (ilk == null) {
			ilk = o;
			son = o;
		} else {
			son.next = o;
			son = o;
		}
	}

	public static void Listele() {
		Lotto gecici = ilk;
		while (gecici != null) {
			System.out.print(gecici.no + " ");
			gecici = gecici.next;
		}
	}

	public static void delete() {
		int no = (int) (Math.random() * 49) + 1;
		Lotto gecici = ilk, bironceki = ilk;
		while (gecici.next != null) {

			if (gecici.no == no) {
				break;
			}
			bironceki = gecici;
			gecici = gecici.next;
		}
		if (gecici == ilk) {
			ilk = gecici.next;
		} else {
			if (gecici == son) {
				son = bironceki;
				bironceki.next = null;
			} else {
				bironceki.next = gecici.next;
			}

		}

	}

}
