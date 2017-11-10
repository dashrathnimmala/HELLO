public class AlarmClock01 {
	public static void main(String[] args) {
		int day_of_week = 5;
		boolean onVac = false;
		System.out.println(ringAlarm(day_of_week, onVac));
	}

	public static String ringAlarm(int dayOfWeek, boolean onVac) {

		if (dayOfWeek < 0 || dayOfWeek > 6)
			return "Invalid Inputs";

		if (!(onVac == true || onVac == false))
			return "Invalid Inputs";

		if (onVac) {

			if (dayOfWeek == 0 || dayOfWeek == 6) {

				return "OFF";
			}
			return "10:00";
		}

		else {
			if (dayOfWeek == 0 || dayOfWeek == 6) {
				return "10:00";
			}
			return "7:00";
		}

	}
}
