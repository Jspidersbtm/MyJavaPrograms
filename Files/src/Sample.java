import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) {
		FileOutputStream f = null;
		try {
			f = new FileOutputStream("Sample.txt");
			String message = "This is a sample program to write";
			byte[] m = message.getBytes();
			f.write(m);
			f.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null)
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		System.out.println("Successfully written the data to the file");
	}
}
