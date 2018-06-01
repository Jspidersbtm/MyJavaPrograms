import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6454455221843508169L;
	transient int age;
	transient String userId;
	transient String userName;

	User(int age, String userId, String userName) {
		super();
		this.age = age;
		this.userId = userId;
		this.userName = userName;
	}

	public static void main(String[] args) throws IOException {
		User u = new User(251, "rtyhijkl", "reftgyhujkml");
		FileOutputStream fs = new FileOutputStream("C:\\Users\\BTM-FAC\\Desktop\\User.txt");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(u);
		os.flush();
		fs.flush();
		os.close();
		fs.close();
		System.out.println("Successfully written object to the file");
	}
}
