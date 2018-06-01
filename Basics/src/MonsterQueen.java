
public class MonsterQueen {
	String colorOfEyes = "Red";
	String colorOfFace = "Black";
	String shapeOfFace = "Round";

	public static void main(String[] args) {
		MonsterQueen m1 = new MonsterQueen();
		MonsterQueen m2 = new MonsterQueen();
		m2.colorOfEyes = "blue";
		System.out.println(m2.colorOfEyes); // blue
		System.out.println(m1.colorOfEyes);// Red

		MonsterQueen m3 = new MonsterQueen();

		MonsterQueen m4 = new MonsterQueen();

		m2.shapeOfFace = "Square";
		System.out.println(m2.shapeOfFace);

	}
}
