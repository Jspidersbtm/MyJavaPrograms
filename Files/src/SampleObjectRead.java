import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SampleObjectRead {
	public static void main(String[] args) {

		FileInputStream fs = null;
		ObjectInputStream os = null;
		try {
			fs = new FileInputStream("C:\\Users\\BTM-FAC\\Desktop\\User.txt");
			os = new ObjectInputStream(fs);
			Object o = os.readObject();
			if (o instanceof User) {
				User u = (User) o;
				System.out.println(u.userId + " " + u.userName + " " + u.age);
			}
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (ClassNotFoundException cn) {
			cn.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
					os = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fs != null) {
				try {
					fs.close();
					fs = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
