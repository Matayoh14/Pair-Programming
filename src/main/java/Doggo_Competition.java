
public class Doggo_Competition {

	private String[] end = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };

	public String winner(int place) {
		String output = "";
		boolean notFirst = false;
		for (int i = 1; i <= 100; i++) {
			if (notFirst && i != place) {
				output = output + ", ";

			}
			if (i != place) {
				String num = Integer.toString(i);
				output += num + end[Integer.parseInt(num.substring(num.length() - 1))];

			}
			if(i == 1 && i == place) {
				continue;
				
			}

			notFirst = true;
		}

		return output;
	}

}
