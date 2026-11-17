package Lektion8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Übung4 {
	
	public static void main(String[] args) throws IOException {
	
		String seite = "<body id=\"www-wikipedia-org\">" + "<div class=\"central-textlogo\">"
				+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
				+ "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">" + "</div>" + "</body>";

		int startIndex = seite.indexOf("https");
		
		if (startIndex != -1) {
			int endIndex = seite.indexOf('\"', startIndex);
			String urll = seite.substring(startIndex, endIndex);
			System.out.println(urll);
			URL url = new URL(urll);
			BufferedImage image = ImageIO.read(url);
			ImageIO.write(image, "png", new File("bild.png"));
		}
	}
}
