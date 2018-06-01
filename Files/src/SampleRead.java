import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleRead {
	public static void main(String[] args) {
		FileReader f = null;
		try {
			f = new FileReader("File.txt");
			int x = 0;
			while ((x = f.read()) != -1) {
				System.out.print((char)x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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

	}
}
