package teste;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class VirarImagem {
	
	public BufferedImage imageFlip(BufferedImage img) {
		int w = img.getWidth();
		int h = img.getHeight();
		BufferedImage dimg = new BufferedImage(w, h, img.getType());
		Graphics2D g = dimg.createGraphics(); g.drawImage(img, 0, 0, w, h, w, 0, 0, h, null);
		g.dispose();
		
		return dimg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}public void paint(Graphics2D g){
		//g.drawImage(Image, 360, 450, null);
		
	}

}
