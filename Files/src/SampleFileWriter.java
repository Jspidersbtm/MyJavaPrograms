import java.io.FileWriter;
import java.io.IOException;

public class SampleFileWriter {
	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("C:\\Users\\BTM-FAC\\Desktop\\File.txt", true);
			String message = "Hello world";
			f.write(message);
			f.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (f != null) {
				try {
					f.close();
					f = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("Message sent");
	}
}
