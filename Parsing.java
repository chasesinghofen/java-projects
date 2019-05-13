import java.util.regex.*;
public class Parsing {

	public static void main(String[] args) {
		String myString = "Mahendra is pretty awesome (523)555-1212";
		String hardString = "Aia Bwh6a Dnk8t Ft2o Hg7o 9tnm Pomi Ab2a 5ren";
		//String myRegex = "[A-Za-z]+\\s";
		String myRegex = "[A-Z][^\\.]|[\\d][^\\.]"; 
		StringBuilder sb = new StringBuilder();
		
		Pattern checkRegex = Pattern.compile(myRegex);
		
		Matcher regexMatcher = checkRegex.matcher(hardString);
		
		while(regexMatcher.find()) {
			//System.out.println("WoHoo I found it");
			//System.out.println(regexMatcher.group().trim());
			//System.out.println(regexMatcher.start());
			//System.out.println(regexMatcher.end());
			sb = sb.append(regexMatcher.group().substring(1));
		}
		System.out.println(sb);
	}
}
