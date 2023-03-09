package calculatortask;

public class ExamScores {

	static int physics = 50;
	static int chemistry = 60;
	static int biology = 70;

	public static String individualScores() {
		return "Physics: " + physics + " Chemistry: " + chemistry + " Biology: " + biology;
	}

	public static String total() {
		int d = (biology + chemistry + physics) * 100;
		return "Overall percentage: " + (d / 450) + "%";
	}

	public static void main(String[] args) {
		System.out.println(total());
		System.out.println(individualScores());
	}
}
