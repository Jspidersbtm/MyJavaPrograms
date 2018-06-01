import java.io.FileInputStream;

public class SampleFileInputStreamRead {

	static void write() throws Exception {
		FileInputStream f = new FileInputStream("File.txt");
		int x = 0;
		while ((x = f.read()) != -1) {
			System.out.println((char) x);
		}
		f.close();
		f = null;
	}

	public static void main(String[] args) {
		try {
			write();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
