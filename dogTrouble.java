public class dogTrouble {

	public static void main(String[] args) {
		System.out.println(dogTrouble(true, 6));
		System.out.println(dogTrouble(true, 7));
		System.out.println(dogTrouble(true, 8));
		System.out.println(dogTrouble(false, 6));
		System.out.println(dogTrouble(false, 7));
		System.out.println(dogTrouble(false, 8));
	}


	public static boolean dogTrouble(boolean bark, int time) {
		if ((bark == true) && (time < 7)) {
			return true;
		}
		if ((bark == true) && (time >= 7)) {
			return false;
		}
		if ((bark == false) && (time < 7)) {
			return false;
		}
		if ((bark == false) && (time >= 7)) {
			return false;
		} else {
			return false;

		}

	}
}