package klausursuebungen;

class Landscape {
	private String[][] colorMatrix;

	public Landscape(String[][] colorMatrix) {
		this.colorMatrix = colorMatrix;
	}

	public Point findColor(String color) {
		System.out.println(colorMatrix.length);
		
		for (int i = 0; i < colorMatrix.length; i++) {
			for (int j = 0; j < colorMatrix[i].length; j++) {
				if (colorMatrix[i][j].equals(color))
					return new Point(i, j);
			}
		}
		return null;
	}
}

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class LandScapeTest {

	public static void main(String[] args) {
	
		String[][] colorMatrix = {{"Aquamarine", "MediumAquaMarine", "Aquamarine", "Aquamarine", "MediumAquaMarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "SkyBlue", "SkyBlue", "LightSkyBlue", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "PaleGreen"}, 
				{"Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "MediumAquaMarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "MediumAquaMarine", "SkyBlue", "SkyBlue", "Aquamarine", "LightSeaGreen", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "MediumAquaMarine", "Aquamarine"}, 
				{"MediumAquaMarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "SkyBlue", "LightSkyBlue", "MediumTurquoise", "Aquamarine", "Aquamarine", "Aquamarine", "MediumAquaMarine", "Aquamarine"}, 
				{"Aquamarine", "Aquamarine", "Aquamarine", "MediumAquaMarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "SkyBlue", "Aquamarine", "Aquamarine", "MediumTurquoise", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "LightGreen", "Aquamarine", "Aquamarine", "MediumAquaMarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "MediumAquaMarine", "MediumSeaGreen", "MediumAquaMarine", "MediumAquaMarine"}, 
				{"Aquamarine", "Aquamarine", "Aquamarine", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "MediumSeaGreen", "MediumSeaGreen", "Aquamarine", "Aquamarine", "MediumAquaMarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "CadetBlue", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"Aquamarine", "Aquamarine", "PaleGreen", "MediumAquaMarine", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "PaleGreen", "PaleGreen", "Aquamarine", "PaleGreen", "PaleGreen", "LightGreen", "Aquamarine", "MediumSeaGreen", "Aquamarine", "MediumAquaMarine", "Aquamarine", "SkyBlue", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "MediumAquaMarine", "Aquamarine", "Aquamarine", "SkyBlue", "PaleTurquoise", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"MediumAquaMarine", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "PaleGreen", "PaleGreen", "LightGreen", "PaleGreen", "LightGreen", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "DarkKhaki", "LightGreen", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "LightGreen", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "PaleGreen", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "DarkKhaki", "LightGreen", "LightGreen", "MediumSeaGreen", "Aquamarine", "Aquamarine", "PaleTurquoise", "Aquamarine"}, 
				{"PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "PaleGreen", "PaleGreen", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "MediumAquaMarine", "Aquamarine", "Aquamarine", "SkyBlue", "Aquamarine"}, 
				{"PaleGreen", "LightGreen", "PaleGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "Khaki", "DarkKhaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "Aquamarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"DarkKhaki", "PaleGreen", "LightGreen", "LightGreen", "PaleGreen", "PaleGreen", "PaleGreen", "PaleGreen", "DarkKhaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "OliveDrab", "Aquamarine", "Aquamarine", "SkyBlue", "SkyBlue"}, 
				{"Khaki", "Khaki", "PaleGreen", "PaleGreen", "PaleGreen", "PaleGreen", "PaleGreen", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "LightGreen", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"Khaki", "DarkKhaki", "Khaki", "PaleGreen", "LightGreen", "PaleGreen", "PaleGreen", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "MediumSeaGreen", "MediumAquaMarine", "Aquamarine", "Aquamarine", "Aquamarine"}, 
				{"Khaki", "Khaki", "DarkKhaki", "Khaki", "LightGreen", "LightGreen", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "Aquamarine", "Aquamarine"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "PaleGreen", "PaleGreen", "DarkSeaGreen", "LightGreen", "Khaki", "Khaki", "LightGreen", "Aquamarine", "Aquamarine"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "Aquamarine"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "LightGreen", "Aquamarine"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "DarkKhaki", "LightGreen", "MediumAquaMarine"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Peru", "Khaki", "BurlyWood", "Khaki", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "LightGreen", "LightGreen", "PaleGreen"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "DarkGoldenRod", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "Khaki", "DarkKhaki", "Khaki", "Khaki", "Khaki", "DarkKhaki"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "DarkKhaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "BurlyWood", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "DarkSalmon", "LightSalmon", "BurlyWood", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "DarkKhaki", "Khaki", "BurlyWood", "DarkSalmon", "DarkSalmon", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki"}, 
				{"DarkKhaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "SandyBrown", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki"}, 
				{"DarkKhaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki"}, 
				{"Khaki", "Khaki", "DarkKhaki", "DarkKhaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki"}, 
				{"Khaki", "DarkKhaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "LightGreen"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "DarkKhaki", "Khaki", "PaleGreen", "Khaki", "LightGreen", "LightGreen", "LightGreen"}, 
				{"PaleGreen", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "PaleGreen", "PaleGreen", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "LightGreen", "LightGreen", "MediumAquaMarine", "LightGreen"}, 
				{"LightGreen", "LightGreen", "LightGreen", "PaleGreen", "PaleGreen", "YellowGreen", "Khaki", "Khaki", "Khaki", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "Khaki", "Khaki", "YellowGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "PaleGreen", "LightGreen", "LightGreen"}, 
				{"LightGreen", "PaleGreen", "PaleGreen", "LightGreen", "LightGreen", "PaleGreen", "Khaki", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "DarkSeaGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "Khaki", "Khaki"}, 
				{"PaleGreen", "LimeGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "Khaki", "BurlyWood", "BurlyWood"}, 
				{"YellowGreen", "LightGreen", "LightGreen", "PaleGreen", "PaleGreen", "PaleGreen", "LightGreen", "LightGreen", "LightGreen", "Khaki", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "LightGreen", "PaleGreen", "LightGreen", "DarkKhaki", "Khaki", "Khaki", "Khaki", "DarkKhaki", "DarkKhaki", "DarkSalmon", "BurlyWood"}, 
				{"LightGreen", "LightGreen", "PaleGreen", "PaleGreen", "PaleGreen", "Khaki", "PaleGreen", "PaleGreen", "Khaki", "Khaki", "Khaki", "LightGreen", "LightGreen", "LightGreen", "Khaki", "PaleGreen", "Khaki", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "DarkSalmon", "Peru", "DarkSalmon"}, 
				{"PaleGreen", "LightGreen", "LightGreen", "LimeGreen", "PaleGreen", "Khaki", "Khaki", "Khaki", "DarkKhaki", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "LightGreen", "Khaki", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "DarkSalmon", "LightSalmon", "LightCoral"}, 
				{"PaleGreen", "LightGreen", "LightGreen", "PaleGreen", "PaleGreen", "LightGreen", "Khaki", "BurlyWood", "BurlyWood", "BurlyWood", "DarkSalmon", "Khaki", "BurlyWood", "BurlyWood", "Khaki", "LightGreen", "Khaki", "Khaki", "SandyBrown", "BurlyWood", "DarkSalmon", "LightSalmon", "LightSalmon", "LightCoral", "LightCoral"}, 
				{"LightGreen", "LightGreen", "LightGreen", "LightGreen", "LimeGreen", "PaleGreen", "BurlyWood", "DarkSalmon", "LightSalmon", "LightSalmon", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "DarkKhaki", "DarkKhaki", "Khaki", "Khaki", "BurlyWood", "DarkSalmon", "LightSalmon", "LightCoral", "LightSalmon", "LightSalmon", "LightCoral"}, 
				{"PaleGreen", "PaleGreen", "PaleGreen", "PaleGreen", "PaleGreen", "DarkKhaki", "BurlyWood", "LightSalmon", "DarkSalmon", "LightSalmon", "LightSalmon", "BurlyWood", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "Khaki", "BurlyWood", "LightSalmon", "LightCoral", "LightPink", "LightPink", "LightCoral", "LightCoral"}, 
				{"Khaki", "PaleGreen", "PaleGreen", "PaleGreen", "LightGreen", "DarkKhaki", "BurlyWood", "DarkSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "LightSalmon", "LightCoral", "LightSalmon", "LightPink", "DarkSalmon", "LightCoral", "LightSalmon"}, 
				{"Khaki", "Khaki", "PaleGreen", "PaleGreen", "PaleGreen", "PaleGreen", "BurlyWood", "DarkSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "BurlyWood", "BurlyWood", "Khaki", "Khaki", "Khaki", "BurlyWood", "Khaki", "LightSalmon", "LightSalmon", "LightPink", "LightPink", "LightSalmon", "LightSalmon", "LightSalmon"}, 
				{"DarkKhaki", "Khaki", "PaleGreen", "PaleGreen", "PaleGreen", "LightGreen", "Khaki", "DarkSalmon", "DarkSalmon", "LightSalmon", "LightSalmon", "Khaki", "Khaki", "BurlyWood", "SandyBrown", "LightSalmon", "BurlyWood", "BurlyWood", "LightSalmon", "LightSalmon", "LightPink", "LightPink", "LightCoral", "LightSalmon", "BurlyWood"}, 
				{"YellowGreen", "Khaki", "Khaki", "Khaki", "PaleGreen", "PaleGreen", "DarkKhaki", "BurlyWood", "DarkSalmon", "DarkSalmon", "BurlyWood", "Khaki", "Khaki", "BurlyWood", "BurlyWood", "LightSalmon", "LightSalmon", "LightSalmon", "LightCoral", "LightPink", "LightPink", "LightCoral", "LightSalmon", "LightSalmon", "BurlyWood"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "PaleGreen", "PaleGreen", "YellowGreen", "Khaki", "BurlyWood", "DarkSalmon", "BurlyWood", "BurlyWood", "Khaki", "BurlyWood", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "LightPink", "LightPink", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "PaleGreen", "LightGreen", "Khaki", "BurlyWood", "DarkSalmon", "BurlyWood", "BurlyWood", "BurlyWood", "BurlyWood", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "LightPink", "LightPink", "LightPink", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "PaleGreen", "LightGreen", "DarkKhaki", "BurlyWood", "DarkSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "DarkSalmon", "LightSalmon", "IndianRed", "LightPink", "LightPink", "LightPink", "LightPink", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon"}, 
				{"Khaki", "Khaki", "Khaki", "Khaki", "Khaki", "PaleGreen", "OliveDrab", "YellowGreen", "BurlyWood", "DarkSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "LightSalmon", "LightCoral", "LightSalmon", "LightPink", "LightPink", "LightPink", "LightPink", "LightSalmon", "LightSalmon", "LightSalmon", "LightCoral"}};
		
		Landscape landscape = new Landscape(colorMatrix);
		Point point = landscape.findColor("IndianRed");
		if (point != null)
			System.out.println("IndianRed found at column: " + point.getX() + ", row: " + point.getY());
		else
			System.out.println("Color not found.");
	}
}
