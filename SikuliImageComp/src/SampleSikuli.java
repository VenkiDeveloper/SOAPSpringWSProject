import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Finder;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SampleSikuli {

	public static void main(String[] args) throws FindFailed, IOException {
		
		
		/*
		System.setProperty("user.dir", "C:\\Program Files\\ImageMagick-6.9.0-Q16");
		
		String imagePath1 = "C:\\Program Files\\ImageMagick-6.9.0-Q16\\1.png";
		String imagePath2 ="C:\\Program Files\\ImageMagick-6.9.0-Q16\\2.png";
		String imagePath3 ="C:\\Program Files\\ImageMagick-6.9.0-Q16\\3.png";
		
		String path = "compare -metric AE "+imagePath1+" "+imagePath2+" "+imagePath3;
		
		 Runtime rt = Runtime.getRuntime();
         //Process pr = rt.exec("cmd /c dir");
         Process pr =   rt.exec(path);

		        BufferedReader r = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		        String line;
		        while (true) {
		            line = r.readLine();
		            if (line == null) { break; }
		            System.out.println(line);
		        }
		       
		String imagePath1 = "C:\\Venky\\JDP\\actual.png";
		String imagePath2 ="C:\\Venky\\JDP\\actual.png";
		Pattern baseImagePattern = new Pattern(imagePath1);
		Pattern capturedImagePattern = new Pattern(imagePath2);

		Screen screen=new Screen();
		Match pass = b.exists(capturedImagePattern);

		System.out.println("Pass = ");
		System.out.println(pass);

		if (screen.exists(capturedImagePattern) != null) {
		     System.out.println("true");
		}
		else{
		         System.out.println("false");
		}
		Screen s = new Screen();
		String img1 = "C:\\Venky\\JDP\\actual-test-screens\\1.png";
	    String img2 = "C:\\Venky\\JDP\\actual-test-screens\\1.png";
	   // String img2 = "C:\\Venky\\JDP\\expected-test-screens\\2.p";
		Finder f = new Finder(img1);
		f.find(img2);
		if(f.hasNext()){
			
			System.out.println("similar");
		}
			  
	     else
	     {
	    	 
	    	 System.out.println("false");
	     } */
		
	}
}
