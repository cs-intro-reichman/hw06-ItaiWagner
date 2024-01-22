import java.awt.Color;

/**
 * Demonstrates the morphing operation into a grayscaling image featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and the number of morphing steps (an int). 
 * For example, to morph thor into grayscale thor in 50 steps, use:
 * java Editor4 thor.ppm 50
 * Note: the class uses the morph and the grayscaled function from Runigram.java.
 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(source);
		Color[][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}
